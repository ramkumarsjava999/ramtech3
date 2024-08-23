package com.evergent.corejava.static1;
//6. static block
public class StaticDemo5 {
	static
	{
		System.out.println("Static Block : open db/network connections");
	}
	
	static String cname="India";
	
	static public void myData() {
		System.out.println("MyData");
	}	

	public static void main(String[] args) {		
		System.out.println(StaticDemo5.cname);
		StaticDemo5.myData();
	}

}
