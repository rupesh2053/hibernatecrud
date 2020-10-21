package com.rupesh.test;

import java.util.List;

import com.rupesh.pojo.Student;
import com.rupesh.service.StudentService;
import com.rupesh.service.impl.StudentServiceImpl;

public class Test {

	public static void main(String[] args) {
		StudentService studentService = new StudentServiceImpl();
		createNewStudent(studentService);
		getStudentById(studentService,104);
		updateStudent(studentService);
		deleteStudentById(studentService,102);
		getAllStudent(studentService);
	}

	private static void deleteStudentById(StudentService studentService, int studentId) {
		studentService.deleteStudent(studentId);
	}

	private static void updateStudent(StudentService studentService) {
		studentService.updateStudent(getStudent());
	}

	private static void getStudentById(StudentService studentService, int studentId) {
		Student student = studentService.getStudentById(studentId);
		if(student == null)
			System.out.println("Student record not available.");
		else
			System.out.println(student);
	}

	private static void getAllStudent(StudentService studentService) {
		List<Student> studentList = studentService.getAllStudent();
		studentList.forEach(System.out::println);
	}

	private static void createNewStudent(StudentService studentService) {
		studentService.addStudent(getStudent());
	}

	private static Student getStudent() {
		return new Student(102, "Rupesh Dulal", "DulalRupesh642@gmail.com", "Dhapakhel", 23, "Bachelor in Computer Application");
	}

}
