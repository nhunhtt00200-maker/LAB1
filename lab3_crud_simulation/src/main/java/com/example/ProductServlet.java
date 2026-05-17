package com.example;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet({"/product/index","/product/create","/product/edit/*","/product/delete/*"})
public class ProductServlet extends HttpServlet {
    private static List<Product> list = new ArrayList<>();
    @Override
    public void init() throws ServletException {
        if(list.isEmpty()) {
            list.add(new Product("P01", "Iphone 15", 2000));
            list.add(new Product("P02", "Samsung S24", 1800));
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = request.getServletPath();
        String pathInfo = request.getPathInfo();
        if (path.contains("/index")) {
            request.setAttribute("items", list);
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        } 
        else if (path.contains("/create")) {
            request.getRequestDispatcher("/form.jsp").forward(request, response);
        } 
        else if (path.contains("/edit")) {
            String id = pathInfo.substring(1); 
            Product p = list.stream().filter(i -> i.getId().equals(id)).findFirst().orElse(null);
            request.setAttribute("product", p);
            request.getRequestDispatcher("/form.jsp").forward(request, response);
        } 
        else if (path.contains("/delete")) {
            String id = pathInfo.substring(1);
            list.removeIf(p -> p.getId().equals(id));
            response.sendRedirect(request.getContextPath() + "/product/index");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price")); 
        list.add(new Product(id, name, price));
        response.sendRedirect(request.getContextPath() + "/product/index");
    }
}
