package com;

// ACCESSING PUBLIC MEMBERS WITHHIN THE SAME CLASS

public class Student {

	public static int id=101;
	public String name="SANDIP";

	public void study() {
		System.out.println("Studying...");
	}
	public Student() {
		System.out.println("Student constructor...");
	}

	public static void main(String[] args) {
		System.out.println("ID:"+Student.id);
		Student s=new Student();
		System.out.println("NAME:"+s.name);
		s.study();



	}

}
