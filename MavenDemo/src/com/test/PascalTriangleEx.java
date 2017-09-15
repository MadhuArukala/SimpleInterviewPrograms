package com.test;

public class PascalTriangleEx {
	
	public static void printPascal(int x){
		
		for(int i =0;i<x;i++) {
			int number = 1;
			for(int k=x;k>i;k--){
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				 System.out.print(number+" ");
				 number = number * (i - j) / (j + 1);
			}
			 System.out.println();
		}
		
	}
	
	public static void main(String args[]){
		printPascal(5);

	}
}
