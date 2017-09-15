package com.test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0;i<=5;i++){
			
			for(int k=i;k<=5;k++)
				System.out.print(" ");
			
			int num=1;
			for(int j=0;j<=i;j++)
			{
				System.out.print(num+" ");
				num=num*(i-j)/(j+1);
			}
			System.out.println();
		}
		
	}

}
