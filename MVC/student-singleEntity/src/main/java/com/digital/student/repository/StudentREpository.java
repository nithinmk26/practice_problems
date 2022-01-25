package com.digital.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.digital.student.entity.Student;

@Repository
public interface StudentREpository extends JpaRepository<Student, Integer>{

}
