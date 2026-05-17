package com.example;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import javax.servlet.*;

@WebServlet({"/home/index","/home/about","/home/contact"})
public class HomeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = request.getServletPath();
        switch (path) {
            case "/home/index":
                response.getWriter().println("Welcome to Home Page");
                break;
            case "/home/about":
                response.getWriter().println("About Us Page");
                break;
            case "/home/contact":
                response.getWriter().println("Contact Page");
                break;
            default:
                response.sendError(HttpServletResponse.SC_NOT_FOUND);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().println("POST method is called");
    }
}
