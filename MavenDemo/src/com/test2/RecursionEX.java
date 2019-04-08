package com.test2;

public class RecursionEX {
	
	
	public int factorialOfGivenNum(int num){
		if(num==1)
			return 1;
		else
			return num*factorialOfGivenNum(num-1);
	}
	int f1=0;
	int f2=1, f3;
	public int getFibanociNum(int num){
		
		f3=f1+f2;
		f1=f2;
		f2=f3;
		if(num==1)
			return f3;
		else
		{
			
			return getFibanociNum(num-1);
		}
			
		
	}
	//returns true if given number is prime
	public boolean isGivenNumPrime(int num){	
		int t=(int) Math.sqrt(num);
		System.out.println(t);
		int count;
		if( Math.sqrt(num)%1==0){
			System.out.println("Given num is not a prime number -1");
			return false;
		}
		for(int i=2;i<=t;i++){
			count=0;
			for(int j=1;j<i;j++){
				if(i%j==0)
					count++;
			}
			if(count==1)
				if(num%i==0){
					System.out.println("Given num is not a prime number -2 ");
					return false;
				}
		}
		System.out.println("Given num is a prime number");
		return true;
	}
	
	public static void main(String[] args){
		RecursionEX r1=new RecursionEX();
		//System.out.println(r1.getFibanociNum(5));
		r1.isGivenNumPrime(5);
		

		
	}
}
