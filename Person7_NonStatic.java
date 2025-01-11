package com.studentribe.corejava.static1;

public class Person7_NonStatic {
	String pname="Ramesh";
	int age=18;
	String address="Hyderabad";
	
	public void display() {
		System.out.println("Person Name :"+pname);
		System.out.println("Person Age :"+age);
		System.out.println("Address :"+address);
	}

	public static void main(String[] args) {
		Person7_NonStatic p1=new Person7_NonStatic();
		 p1.age=35;
		 System.out.println(p1.age);
		 p1.display();
		 Person7_NonStatic p2=new Person7_NonStatic();
		 
		 System.out.println(p2.age);
		 p2.age=83;
		 System.out.println(p2.age);
		 System.out.println(p1.age);
	}

}
