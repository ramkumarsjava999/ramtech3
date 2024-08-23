package com.evergent.corejava.static1;
//3.	we can access static variables and methods direct through 
//classname.methodname and classname.variable name
public class StaticDemo1 {
	
	static String cname="India";
	
	static public void myData() {
		System.out.println("MyData");
	}	

	public static void main(String[] args) {		
		System.out.println(StaticDemo1.cname);
		StaticDemo1.myData();
	}

}
