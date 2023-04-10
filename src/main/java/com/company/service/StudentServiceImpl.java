package com.company.service;

import com.company.model.Student;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl  extends DataBaseConnect implements StudentService{
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
    public Student save() {
        return null;
    }

    @Override
    public List<Student> findAll() {
        statement = connect.getDbConnection();
        String GET_ALL_STUDENT = "Select * from student";
        String str = null;
        List<Student>listStr = new ArrayList<>();

        try {
            ResultSet rs = statement.executeQuery(GET_ALL_STUDENT);
            while (rs.next()) {
                Student student = new Student( rs.getInt("id"), rs.getString("name"),
                        rs.getString("surname"), rs.getInt("age"),
                        rs.getString("gender"));
                listStr.add(student);
            }

            statement.close();
            }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return listStr;
    }
    }

