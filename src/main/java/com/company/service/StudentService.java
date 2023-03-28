package com.company.service;




import com.company.model.Student;

import java.util.List;

public interface StudentService {

    String findById(int id);
    void deleteById();
    Student save();
    List<Student> findAll();

}
