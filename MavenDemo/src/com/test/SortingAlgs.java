package com.test;

public class SortingAlgs {
	public static void main(String[] args){
		selectionSort(new int[]{5,1,0,-4,10});
	}
	public static void bubbleSort(int[] x){
		for(int i=x.length-1;i>=0;i--)
			for(int j=0;j<x.length-1;j++){
				if(x[j]>x[j+1]){
					int t;
					t=x[j];
					x[j]=x[j+1];
					x[j+1]=t;
				}
			}
		for(int i:x)
			System.out.print(i+", ");
	}

	public static void selectionSort(int[] x){
		int index;
		for(int i=0;i<x.length;i++){
			index=i;
			for(int j=i+1;j<x.length;j++)
				if(x[index]>x[j])
					index=j;
			int t;
			t=x[i];
			x[i]=x[index];
			x[index]=t;
			
		}
		for(int i:x)
			System.out.print(i+", ");
		
	}
}
