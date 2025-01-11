package com.studentribe.corejava.static1;
/*
 7.	Non static methods can access static variables and static methods
 */
public class StaticProg4 {
	// non static variable
	String name="Ramesh";
	// static variable	
	static String countryName="India";	
	// static method
	static public void  myData() {
		System.out.println("myData method : static method");
	}
	public void show() {
		myData();
		System.out.println("show : non static method  :"+countryName);
	}
	public static void main(String[] args) {
		// static method and static variable calling 
		System.out.println(StaticProg4.countryName); 
		StaticProg4.myData();
		StaticProg4 sp4=new StaticProg4();
		sp4.show();
	}

}
