package com.rupesh.dao;
import java.util.List;
import com.rupesh.pojo.Student;

public interface StudentDao {
	public abstract void addStudent(Student student);
	public abstract List<Student> getAllStudent();
	public abstract Student getStudentById(int studentId);
	public abstract int updateStudent(Student student);
	public abstract int deleteStudent(int studentId);
}
