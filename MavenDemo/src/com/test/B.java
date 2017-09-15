package com.test;

class A{
	A(){
		System.out.println("A");
	}
	A(String text){
		System.out.println("A-"+text);
	}
	A(int i){
		System.out.println("A-"+i);
	}
	public static void main(String args[]){
		A a1=new A();
	}
}
public class B extends A {
	
	public static void main(String args[]){
		B b1=new B();
		
		
	}
}
