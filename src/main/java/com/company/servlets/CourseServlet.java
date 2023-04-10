package com.company.servlets;

import com.company.model.Course;
import com.company.model.Student;
import com.company.service.CourseService;
import com.company.service.CourseServiceImpl;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "helloCourse", value = "/course")
public class CourseServlet extends HttpServlet {

    CourseServiceImpl service = new CourseServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<String> list = service.findAll();
        PrintWriter printWriter = response.getWriter();
        printWriter.write("\n"+"Our Course"+"\n");
        printWriter.write(String.valueOf(list));
    }

        @Override
        protected void doPost (HttpServletRequest request, HttpServletResponse response) throws
        ServletException, IOException {

        }
    }

