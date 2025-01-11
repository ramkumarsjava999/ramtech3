package com.studentribe.corejava.static1;
/*
 6.	Static methods can not access non static methods and non static variables
 */
public class StaticProg3 {
	// non static variable
	String name="Ramesh";
	// static variable	
	static String countryName="India";	
	// static method
	static public void  myData() {
		System.out.println("myData method : static method");
		//show();  //Cannot make a static reference to the non-static method show() from the type StaticProg3
	  //Cannot make a static reference to the non-static field name
		//System.out.println(name);
	}
	public void show() {
		System.out.println("show : non static method"); 	}
	public static void main(String[] args) {
		// static method and static variable calling 
		System.out.println(StaticProg3.countryName); 
		StaticProg3.myData();
	}
}
