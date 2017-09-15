package com.test;

public class BubbleSort {
	
	public static void main(String[] args){
		int[] new_array=new int[]{5,1,12,-5,16};
		for(int i=new_array.length-1;i>=0;i--){
			int a;
			for(int j=0;j<i-1;j++){
				a=j+1;
				if(a<new_array.length){
					if(new_array[j]>new_array[a]){
						int t=new_array[j];
						new_array[j]=new_array[a];
						new_array[a]=t;
					}
				}
				for(int r=0;r<new_array.length;r++)
					System.out.print(new_array[r]+" ");
				System.out.println();					
			}
			System.out.println();
		}
	}
}
