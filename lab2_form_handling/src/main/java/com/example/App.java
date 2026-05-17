package com.example;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet({"/app/form","/app/check"})
public class App extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/App.jsp").forward(request, response);
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String gender = request.getParameter("gender");
        String city = request.getParameter("city");
        String[] hobbies = request.getParameterValues("hobbies");

        PrintWriter out = response.getWriter();

        if ("123".equals(password)) {
            out.println("<html>");
            out.println("<head><title>Result</title></head>");
            out.println("<body>");
            out.println("<h1>Login successful!</h1>");
            out.println("<table border='1'>");
            out.println("<tr><td>Username</td><td>" + username + "</td></tr>");
            out.println("<tr><td>Password</td><td>" + password + "</td></tr>");
            out.println("<tr><td>Gender</td><td>" + gender + "</td></tr>");
            out.println("<tr><td>City</td><td>" + city + "</td></tr>");
            out.println("<tr><td>Hobbies</td><td>");
            if (hobbies != null && hobbies.length > 0) {
                for (String h : hobbies) {
                    out.println(h + " ");
                }
            } else {
                out.println("No hobbies selected");
            }
            out.println("</td></tr>");
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
        } else {
            out.println("<html><body>");
            out.println("<h2>Invalid password.</h2>");
            out.println("</body></html>");
        }
    }
}
