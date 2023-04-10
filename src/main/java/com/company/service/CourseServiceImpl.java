package com.company.service;

import com.company.model.Course;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CourseServiceImpl implements CourseService{
    DataBaseConnect connect = new DataBaseConnect();
    Statement statement = null;
    @Override
    public String findById(int id) {
        return null;
    }

    @Override
    public void deleteById() {

    }

    @Override
    public Course save() {
        return null;
    }

    @Override
    public List<String> findAll() {
       statement = connect.getDbConnection();
       String GET_ALL_COURSE = "Select name_course from course";
       List<Course>listCourse = new ArrayList<>();
       String str = null;
       List<String>listStr = new ArrayList<>();
        try {
            ResultSet rs = statement.executeQuery(GET_ALL_COURSE);
            while (rs.next()){
                str = rs.getString("name_course");
                listStr.add(str);
            }

            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listStr;
    }
}
