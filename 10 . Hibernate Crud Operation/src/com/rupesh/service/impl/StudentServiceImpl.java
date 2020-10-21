package com.rupesh.service.impl;

import java.util.List;

import com.rupesh.dao.StudentDao;
import com.rupesh.dao.impl.StudentDaoImpl;
import com.rupesh.pojo.Student;
import com.rupesh.service.StudentService;

public class StudentServiceImpl implements StudentService {

	private StudentDao studentDao = new StudentDaoImpl();

	@Override
	public void addStudent(Student student) {
		studentDao.addStudent(student);
	}

	@Override
	public List<Student> getAllStudent() {
		return studentDao.getAllStudent();
	}

	@Override
	public Student getStudentById(int studentId) {
		return studentDao.getStudentById(studentId);
	}

	@Override
	public int updateStudent(Student student) {
		return studentDao.updateStudent(student);
	}

	@Override
	public int deleteStudent(int studentId) {
		return studentDao.deleteStudent(studentId);
	}

}
