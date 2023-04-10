package com.company.servlets;



import com.company.model.Student;
import com.company.service.StudentServiceImpl;

import java.io.*;
import java.util.List;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloStudent", value = "/student")
public class StudentServlet extends HttpServlet {

    StudentServiceImpl service = new StudentServiceImpl();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Student> list = service.findAll();
        PrintWriter printWriter = response.getWriter();
        printWriter.write("\n" + "Our Student" + "\n");
        printWriter.write(String.valueOf(list));

    }




        //printWriter.write(str);
//        List<String>listStr = null;
//        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection con=DriverManager.getConnection(
//                    "jdbc:mysql://Localhost:3306/studentoncourse","root","root");
//
//            Statement s = con.createStatement();
//            ResultSet rs = s.executeQuery("Select id, name, surname from student");
//
//            while(rs.next()) {
//                System.out.println(((rs.getInt("id") + " "
//                        + (rs.getString("name") + " " + (rs.getString("surname"))))));
//                str = ((rs.getInt(1) + " " + (rs.getString(2) + " " +
//                        (rs.getString(3) ))));
//                printWriter.write("\n"+str+"\n");
//            }
//
//            s.close();

//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    catch (Exception e) {
//        e.printStackTrace();
//    }
//}


//        public void destroy () {

    }
