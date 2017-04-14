package com.proj.service;

import java.util.List;

import com.proj.model.Student;

public interface StudentService {
	
	
	public List<Student> getallstudents();
	
	public Student getStudentById(long id);
	
	public void addStudent(Student student);
	
	public void deleteStudentById(long id);
	
	public Student updateStudentById(Student student, long id);

}
