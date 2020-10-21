package com.rupesh.dao.impl;

import java.util.List;

import org.hibernate.Session;

import com.rupesh.dao.StudentDao;
import com.rupesh.pojo.Student;
import com.rupesh.util.HibernateUtil;

public class StudentDaoImpl implements StudentDao {

	@Override
	public void addStudent(Student student) {
		try(Session session = HibernateUtil.getSessionFactory().openSession()) {
			session.beginTransaction();
			session.save(student);
			session.getTransaction().commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> studentList = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()) {
			studentList = session.createCriteria(Student.class).list();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return studentList;
	}

	@Override
	public Student getStudentById(int studentId) {
		Student student = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()) {
			student = session.get(Student.class,studentId);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return student;
	}

	@Override
	public int updateStudent(Student student) {
		try(Session session = HibernateUtil.getSessionFactory().openSession()) {
			student = session.get(Student.class,102);

			if(student == null)
				System.out.println("Student record not available.");
			else {
				session.beginTransaction();
				session.update(student);
				session.getTransaction().commit();
				System.out.println("Student Record Updated Successfully.");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int deleteStudent(int studentId) {
		try(Session session = HibernateUtil.getSessionFactory().openSession()) {
			Student student = session.get(Student.class,studentId);
			if(student != null) {
				session.beginTransaction();
				session.delete(student);
				session.getTransaction().commit();
				System.out.println("Student Record Deleted Successfully");
			}else {
				System.out.println("Student Record Not Available.");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

}
