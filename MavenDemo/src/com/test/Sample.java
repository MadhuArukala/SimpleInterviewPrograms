package com.test;

public class Sample {
	
	public static void fun(int n){
		int a,t,r=0,temp=n,temp2,f,x;
		String s2=String.valueOf(n);
		while(n>n%10){
			String s=String.valueOf(n);
			a=n%10;
			n=n/10;
			r=r*10+a;
			t=(int) Math.pow(10, s.length()-1)*r+n;
			
			System.out.println(t);
			if(t!=temp){
				temp2=t;
				while(true){
				f=t/((int) Math.pow(10, s2.length()-1));
				t=t-f*((int) Math.pow(10, s2.length()-1));
				x=t*((int) Math.pow(10, s2.length()-2))+f;
				if(x==temp2)
					break;
				System.out.println(x);
				t=x;
				}
				
				
			}
		}
		
	}
	
	public static void main(String[] args){
			
		fun(122);
		
	}

}
