package com.company.service;

import com.company.model.Course;
import com.company.model.Student;

import java.util.List;

public interface CourseService {
    String findById(int id);
    void deleteById();
    Course save();
    List<String> findAll();


}
