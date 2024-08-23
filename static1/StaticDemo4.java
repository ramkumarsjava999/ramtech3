package com.evergent.corejava.static1;
//6.	Non static methods can access static methods and static variables
public class StaticDemo4 {	
	static String cname="India"; // Static variable / classes variables
	       String name="Ravi";   // non-static variables		      
	static public void myData() // static method
	{   
		System.out.println("MyData: Static method");
	}	
	public void myShow()  // non static method
	{     myData();
		System.out.println("myShow non static method :"+cname);
	}
	public static void main(String[] args) {		
		//System.out.println(StaticDemo2.cname);
		//StaticDemo2.myData();
		System.out.println(cname);
		myData();
		StaticDemo4 s4=new StaticDemo4();
		s4.myShow();
	} 
}
