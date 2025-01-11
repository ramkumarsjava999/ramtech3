package com.studentribe.corejava.static1;
/*
 8.	Static block(static {  } ) will call , whenever class loaded into JVM First initialize static block
 */
public class StaticProg5 {
	static {
		System.out.println("Static Blcok  First....");
		 myData();
	}	
	
	static public void  myData() {
		System.out.println("myData method");
	}
	
	public void show() {
		System.out.println("show : non static method");
	}
	
	public static void main(String[] args) {
		 
		StaticProg5.myData();

	}

}
