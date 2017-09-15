package com.test;

import java.util.ArrayList;
import java.util.Iterator;

public class StringEx2 {
	
	public static void main(String args[]){
		
	/*	int in[]=new int[]{1,2,4,0,3,9,0,1,2};
		
		ArrayList al=new ArrayList();
		for(int i=0;i<in.length;i++){
			int count=0;
			for(int j=i+1;j<in.length;j++)
			{
				if(in[i]==in[j])
					count++;
			}
			if(count==0)
				al.add(in[i]);
		}
		
		Iterator it=al.iterator();
		
		while(it.hasNext())
			System.out.print(it.next());
		System.out.println();
		System.out.println(al.size());
		*/
		String expr="<{fsd}f>";
		String t1="",t2="";
		for(int i=0;i<expr.length();i++){
			char c=expr.charAt(i);
			if(c=='<' || c=='>' || c=='{' || c=='}' || c=='(' || c==')' || c=='[' || c==']')
				t1=t1+c;
		}
		
		for(int i=expr.length()-1;i>=0;i--){
			char c=expr.charAt(i);
			if(c=='<' || c=='>' || c=='{' || c=='}' || c=='(' || c==')' || c=='[' || c==']'){
				switch(c){
					case '<':
						c='>';break;
					case '>':
						c='<';break;
					case '{':
						c='}';break;
					case '}':
						c='{';break;
					case '[':
						c=']';break;
					case ']':
						c='[';break;
					case '(':
						c=')';break;
					case ')':
						c='(';break;
				}
				
				
				t2=t2+c;
			}
		}
		
		System.out.println(t1);
		System.out.println(t2);
		
		if(t1.equals(t2))
			System.out.println("valid expression");
		else
			System.out.println("Invalid valid expression");
		
		
		
		
		
		/*
		
		int i=10;
		String s=String.valueOf(i);
		String str="fdsah456sda";
		//System.out.println(str.replaceAll("\\D", ""));
		
		String str2="(1, 2 )";
		//System.out.println(str2.replaceAll("[() ]", ""));
		
		//System.out.println(str.replaceAll("d", ""));
		
		String str3="zx abc zx acv abc zx jk jkl zx.";
		
	
		//System.out.println(str3.split(" ").length-str3.replaceAll(" zx ", " ").split(" ").length);
		
		
		System.out.println(Integer.SIZE);
		*/
	}

}
