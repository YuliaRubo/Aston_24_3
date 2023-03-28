package com.company.servlets;

import com.company.service.Database;

import java.io.*;
import java.sql.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/student")
public class HelloServlet extends HttpServlet {
   // private String message;

//    public void init() {
//        message = "Hello World!";
//    }
// Connection connection;
// PreparedStatement preparedStatement;
// ResultSet rs;
 String SQL = "SELECT nama, surname FROM STUDENT";

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter printWriter=response.getWriter();

//            String connectionString = "jdbc:mysql://localhost:3306/studentoncourse";
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            try {
               Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentOnCourse", "root", "root");
               Statement statement = connection.createStatement();
               ResultSet rs = statement.executeQuery(SQL);
               while (rs.next()){
                   printWriter.println(rs.getString("name"));
                   printWriter.println(rs.getString("surname"));
               }
            statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

    }


//        String ps = request.getRequestURI();
//        response.getWriter().write(ps);

//        PrintWriter out = response.getWriter();
//        out.println("<html><body>");
//        out.println("<h1>" + message + "</h1>");
//        out.println("</body></html>");


    public void destroy() {
    }
}