package org;
import com.Father;

// ACCESSING PROTECTED MEMBERS OUTSIDE THE PACKAGE BY USING IS-A RELATIONSHIP AND IMPORT STATEMENT

public class Son extends Father{

	public static void main(String[] args) {
		Son s=new Son();
		s.walk();
		System.out.println("NAME: "+s.name);
		

	}

}
