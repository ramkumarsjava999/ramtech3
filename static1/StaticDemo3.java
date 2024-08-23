package com.evergent.corejava.static1;
//5.static methods can not access static methods and 
//static variables 
public class StaticDemo3 {
	
	static String cname="India"; // Static variable / classes variables
	       String name="Ravi";   // non-static variables		      
	static public void myData() // static method
	{   //Cannot make a static reference to the non-static method myShow() 
		//from the type StaticDemo3 
		//myShow();
		System.out.println("MyData");
	}	
	public void myShow()  // non static method
	{ 		System.out.println("myShow non static method");
	}
	public static void main(String[] args) {		
		//System.out.println(StaticDemo2.cname);
		//StaticDemo2.myData();
		System.out.println(cname);
		myData(); 	} }
