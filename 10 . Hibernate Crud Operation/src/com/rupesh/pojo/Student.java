package com.rupesh.pojo;

public class Student {
	private int id;
	private String name;
	private String email;
	private String address;
	private int age;
	private String course;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Student(int id, String name, String email, String address, int age, String course) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.age = age;
		this.course = course;
	}

	public Student() {
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + ", age=" + age
				+ ", course=" + course + "]";
	}

}
