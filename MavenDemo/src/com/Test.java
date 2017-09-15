package com;

public class Test {
	
	Test(Object obj){
		System.out.println(obj +" Object");
	}
	
	Test(String obj){
		System.out.println(obj);
	}
//	Test(int obj){
//		System.out.println(obj);
//	}
	
	public static void main(String[] args){
		new Test(3.0);
	}

}
