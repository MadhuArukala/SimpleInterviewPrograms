package com.test;

public class StackSample {
	
	int stack_size;
	int top;
	int[] stack_array;
	StackSample(int size){
		this.stack_size=size;
		this.stack_array=new int[size];
		this.top=-1;
	}
	public void push(int entry){
		if(isStackFull())
			 increaseStackSize();
		stack_array[++top]=entry;
	}
	public int pop() throws Exception{
		
		 if(this.isStackEmpty()){
	            throw new Exception("Stack is empty. Can not remove element.");
	        }
	        int entry = this.stack_array[top--];
	        System.out.println("Removed entry: "+entry);
	        return entry;
		
	}
	public int peek(){
		
		 return stack_array[top];
	}
	public void increaseStackSize(){
		int[] newArray=new int[this.stack_size*2];
		for(int i=0;i<stack_array.length;i++)
			newArray[i]=stack_array[i];
		this.stack_array=newArray;
		this.stack_size=this.stack_size*2;
	}
	public boolean isStackEmpty(){
		return (top==-1);
	}
	 public boolean isStackFull() {
	        return (top == stack_size - 1);
	    }
	
}
