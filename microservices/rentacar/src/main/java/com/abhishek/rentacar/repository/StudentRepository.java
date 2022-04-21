package com.abhishek.rentacar.repository;

import com.abhishek.rentacar.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 21/04/2022
 * Time: 4:52 pm
 */
public interface StudentRepository extends JpaRepository<Student, Integer> {


}
