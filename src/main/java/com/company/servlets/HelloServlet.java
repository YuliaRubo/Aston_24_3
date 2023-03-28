package com.company.servlets;



import java.io.*;
import java.sql.*;
import java.util.Map;
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
  //  String SQL = "SELECT nama, surname FROM STUDENT";

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        response.setContentType("text/html");
 //       String sp = request.getRequestURI();
//        //Map<String, Integer>  mapl =
 //       response.getWriter().write(sp);
        PrintWriter printWriter = response.getWriter();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentoncourse","root","root");

            Statement stmt = con.createStatement();
            ResultSet rs=stmt.executeQuery("select surname from student");
            while(rs.next())
                //System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
                printWriter.write(rs.getInt(rs.getString(3)));
            con.close();
        }catch(Exception e)
        { System.out.println(e);}
    }


        public void destroy () {
        }
    }
