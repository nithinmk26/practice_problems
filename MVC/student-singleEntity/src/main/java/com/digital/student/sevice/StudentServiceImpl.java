package com.digital.student.sevice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digital.student.entity.Student;
import com.digital.student.repository.StudentREpository;

@Service
public class StudentServiceImpl {
	
	@Autowired
	private StudentREpository studentRepository;

	public void insertStudent(Student student) {
		studentRepository.saveAndFlush(student);
	}

	public List<Student> fetchAllSTudents() {
		return studentRepository.findAll();
	}

	public Student fetchStudentByID(Integer id) throws Exception {
		Optional<Student> student =  studentRepository.findById(id);
		if(!student.isPresent()) {
			throw new Exception("NOT FOUND>>!!!!!");
		}
		return student.get();
	}

}
