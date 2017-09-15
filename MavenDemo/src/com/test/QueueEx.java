package com.test;

public class QueueEx {	
	int Q_size,front,rear;
	int [] Q_array;
	QueueEx(int size){
		Q_size=size;
		Q_array=new int[size];
		front=0;
		rear=-1;
	}
	public void enQueue(int entry){	
		
		Q_array[++rear]=entry;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
