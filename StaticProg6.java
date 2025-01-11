package com.studentribe.corejava.static1;
/*
 
 */
public class StaticProg6 {
	
	static String countryName="India";
	
	static public void  myData() {
		
		System.out.println("myData method :"+ countryName );
		countryName="Welcome";
	}
	public void display() {
		System.out.println("country name :"+countryName);
	}

	public static void main(String[] args) {
		System.out.println(StaticProg6.countryName); 
		StaticProg6.myData();
		
		StaticProg6 sp6=new StaticProg6();
		sp6.display();

	}

}
