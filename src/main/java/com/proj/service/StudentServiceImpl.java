package com.proj.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proj.dao.StudentDAO;
import com.proj.model.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDAO studentDAO;

	@Override
	public List<Student> getallstudents() {
		
		List<Student> studentlist = new ArrayList<Student>();
		
		studentDAO.findAll().forEach(studentlist::add);
		
		return  studentlist;
		
	}

	@Override
	public Student getStudentById(long id) {
		
		return  studentDAO.findOne(id);
	}

	@Override
	public void addStudent(Student student) {
		 studentDAO.save(student);
	
	}

	@Override
	public void deleteStudentById(long id) {
		
		studentDAO.delete(id);

	}

	@Override
	public Student updateStudentById(Student student,long id) {
		return studentDAO.save(student);
	}

}
