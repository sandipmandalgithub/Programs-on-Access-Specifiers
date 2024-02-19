package com;
// ACCESSING PUBLIC MEMBERS OUTSIDE THE CLASS
public class Employee1 {

	public static void main(String[] args) {
		
		Employee e=new Employee();
			System.out.println("Name:"+e.name);
			System.out.println("Salary:"+e.salary);
		
			Employee.work();
		}

	}


