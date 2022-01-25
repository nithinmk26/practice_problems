/**
 * 
 */
package com.digital.student.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.digital.student.entity.Student;
import com.digital.student.sevice.StudentServiceImpl;

/**
 * @author M1056182
 *
 */

@Controller
public class StudentController {
	
	@Autowired
	private StudentServiceImpl StudetServiceImpl;
	
	@RequestMapping("/")
	public String load() {
		return "index";
	}
	
	@GetMapping("/addStudent")
	public String addStudent() {
		return "employee";
	}
	
	@PostMapping("/insertStudent")
	public String inserStudent(Student student, Model model) {
		StudetServiceImpl.insertStudent(student);
		List<Student> studetList = StudetServiceImpl.fetchAllSTudents();
		model.addAttribute("employeeName",studetList);
		return "studentlist";
	}

	@GetMapping("/viewStudents")
	public String viewStudents(Model model) {
		List<Student> studetList = StudetServiceImpl.fetchAllSTudents();
		model.addAttribute("employeeName",studetList);
		return "studentlist";
	}
	
	
	@GetMapping("/find")
	public String find() {
		return "studentquery";
	}
	
	@GetMapping("/findStudent")
	public String findStudentByID(int id,Model model) {
		Student studetList;
		try {
			studetList = StudetServiceImpl.fetchStudentByID(id);
			model.addAttribute("employeeName",Arrays.asList(studetList));
			return "studentlist";
		} catch (Exception e) {
			model.addAttribute("exceptionMessage", e.getLocalizedMessage());
			return "excetionpage";
		}
	
	}
	
}
