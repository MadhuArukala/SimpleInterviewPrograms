package com.test;

public class SelectionSort {
	
	public static void main(String[] args){
		
		int array[]=new int[]{5,1,12,-5,16,2,12,14};
		int sNum,t;
		for(int r=0;r<array.length;r++)
			System.out.print(array[r]+" ");
		System.out.println();
		
		for(int n=0;n<array.length-1;n++){
			sNum=n;
			for(int i=n;i<array.length;i++)
			{
				t=i+1;
				if(t<array.length){
					if(array[sNum]>array[t]){
						sNum=t;
					}
				}
			}
			if(sNum!=0){
				t=array[n];
				array[n]=array[sNum];
				array[sNum]=t;
			}
			for(int r=0;r<array.length;r++)
				System.out.print(array[r]+" ");
			System.out.println();
		}
	}
}
