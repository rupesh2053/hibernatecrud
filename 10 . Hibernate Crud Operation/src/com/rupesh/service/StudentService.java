package com.rupesh.service;
import java.util.List;
import com.rupesh.pojo.Student;

public interface StudentService {
	public abstract void addStudent(Student student);
	public abstract List<Student> getAllStudent();
	public abstract Student getStudentById(int studentId);
	public abstract int updateStudent(Student student);
	public abstract int deleteStudent(int studentId);
}
