package com.studentribe.corejava.static1;
/*
 1.	Static is keyword 
2.	We can declare static as  variables and methods
3.	Without Object certation we can access static variables and methods 
4.	Static methods and variables we can access through classname.variable name class.method name 

 */
public class StaticProg1 {
	
	static String countryName="India";
	
	static public void  myData() {
		 int k=100;
		System.out.println("myData method"+k);
	}

	public static void main(String[] args) {
		System.out.println(StaticProg1.countryName); 
		StaticProg1.myData();
	       myData();
		System.out.println("myData method");

	}

}
