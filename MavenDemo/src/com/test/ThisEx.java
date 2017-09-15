package com.test;

import java.util.Random;

public class ThisEx{
	int ID;
	String name;
	float salary;
	String dept;
	
	public void setEmpDetails(int ID, String name, float salary, String department){
		
		this.ID=ID;
		this.name=name;
		salary=salary;
		dept=department;
	}
	public void printEmpDetails(){
		System.out.println("Emp ID: "+ID);
		System.out.println("Emp Name: "+name);
		System.out.println("Emp Salary: "+salary);
		System.out.println("Emp Department: "+dept);
	}
	public static void main(String args[]){
		ThisEx t1=new ThisEx();
		t1.setEmpDetails(1221,"Anil",70000,"IT");
		t1.printEmpDetails();
	}
}


class A1{
	A1(){
		this("Karthik");
		System.out.println("Default Constructor");
	}
	A1(String name){
		System.out.println(name);
	}
	
	public static void main(String args[]){
		A1 a=new A1();
		
		 
		
	}
}






















