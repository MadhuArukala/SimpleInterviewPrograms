package com.test;

public class JavaDemo {
	
	static int x;
	int y;
	boolean flag;
	char ch;
	float f;
	double d;
	short s;
	long l;
	byte b;
	String str;
	
	static{
		
		System.out.println("Static block");
	}
	{
		System.out.println(x);
		System.out.println("Non static block");
	}
	public static void main(String args[]){	
		JavaDemo j1=new JavaDemo();
		JavaDemo j2=new JavaDemo();
		System.out.println(j1.x);//output-0
		System.out.println(j1.y);//output-0
		System.out.println(j1.flag);//output-false
		System.out.println(j1.ch);//output-0
		System.out.println(j1.f);//output-0.0
		System.out.println(j1.d);//output-0.0
		System.out.println(j1.s);//output-0
		System.out.println(j1.l);//output-0
		System.out.println(j1.b);//output-0
		System.out.println(j1.str);//output-null
		
		
	}
	

}
