package com.studentribe.corejava.static1;
/*
 5.	Static methods can access only static variables and static methods 
 */
public class StaticProg2 {
	// non static variable
	String name="Ramesh";
	// static variable	
	static String countryName="India";
	
	// static method
	static public void  myData() {
		System.out.println("myData method : static method :"+countryName);
	}

	public void show() {
		System.out.println("show : non static method");
	}
	public static void main(String[] args) {
		System.out.println(countryName);		
		myData();
	}
}
