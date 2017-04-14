package com.proj.dao;

import org.springframework.data.repository.CrudRepository;

import com.proj.model.Student;



public interface StudentDAO extends CrudRepository<Student, Long>{
	
	
	/*public List<Student> getallstudents();
	
	public Student getStudentById(long id);
	
	public void addStudent(Student student);
	
	public void deleteStudentById(long id);
	
	public Student updateStudentById(long id);*/
	
	

}
