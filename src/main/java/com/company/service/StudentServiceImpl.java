package com.company.service;



import com.company.model.Student;

import java.sql.*;
import java.util.List;


public class StudentServiceImpl extends Database implements StudentService{


        Connection connection = null;
        Statement statement = null;
        ResultSet rs = null;


    @Override
    public String findById(int id) {
        StringBuilder student = new StringBuilder();
        String sql = "SELECT * FROM student WHERE  id =?;";
        Database.getDbConnection();
        try{
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
           preparedStatement.setLong(1, id);
           try(ResultSet rs =preparedStatement.executeQuery()){
               while (rs.next()){
                   student.append(rs.getInt(1))
                           .append(" ")
                           .append(rs.getString(2))
                           .append(" ")
                           .append(rs.getString(3))
                           .append(" ")
                           .append(rs.getInt(4))
                           .append(" ")
                           .append(rs.getString(5))
                           .append("\n");
               }
           }


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return student.toString().trim();
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
        return null;
    }
}


