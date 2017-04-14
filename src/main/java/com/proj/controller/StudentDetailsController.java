package com.proj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.proj.model.Student;
import com.proj.service.StudentService;

@RestController

public class StudentDetailsController {
	
		
	@Autowired
	private StudentService studentService;
	@RequestMapping("/home")
	public String studenthome(){
		
		return "This is Student controller Home method";
	}
	
	@RequestMapping(value="/students", method=RequestMethod.GET)
	public List<Student> getAllStudents(){
		
		return 	studentService.getallstudents();
		
	}
	
	@RequestMapping(value = "/student/{id}" ,method=RequestMethod.GET)
	public Student getStudentById(@PathVariable long id){
		
		Student student = studentService.getStudentById(id);
		return student;
	}
	
	@RequestMapping(value= "/updatestudent/{id}",method=RequestMethod.PUT)
	public Student updateStudentById(@PathVariable long id, @RequestBody Student student){
		
		student = studentService.updateStudentById(student,id);
		return student;
	}
	
	@RequestMapping(value = "/addstudent", method = RequestMethod.POST)
	public void addStudent(@RequestBody Student student){
		studentService.addStudent(student);
	
	}
	
	@RequestMapping(value= "/student/{id}",method = RequestMethod.DELETE)
	public void deleteStudentById(@PathVariable long id){
		
		studentService.deleteStudentById(id);
	}
	
	

}
