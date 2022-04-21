package com.abhishek.rentacar.service;

import com.abhishek.rentacar.model.Student;
import com.abhishek.rentacar.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 21/04/2022
 * Time: 4:19 pm
 */
@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }
}
