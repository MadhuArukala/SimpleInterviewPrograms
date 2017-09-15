package com.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ArraysEx {
	
	public static void printGivenIntegerArrayInAsc(int[] a){
		System.out.print("[");
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++)
				if(a[i]>a[j]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
		}
		
		for(int i:a)
			System.out.print(i+", ");
		System.out.println("]");
	}
	public static void printGivenWordsInAsc(String[] a){
		String temp;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if((a[i].toLowerCase()).compareTo(a[j].toLowerCase())>=-1){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					System.out.print(" count ");
				}
			}
			
			
		}
		
		for(String r:a)
			System.out.print(r+", ");
		
	}
	public static boolean verifyGivenWordsInAsc(String[] words){
		for(int i=0;i<words.length;i++){
			for(int j=i+1;j<words.length;j++){
				if((words[i].toLowerCase()).compareTo(words[j].toLowerCase())>-1 && (words[i].toLowerCase()).compareTo(words[j].toLowerCase())!=0){
					System.out.println((words[i].toLowerCase()).compareTo(words[j].toLowerCase()));
					return false;
				}
			}
		}
		return true;
	}
	public static void elemenateDuplicateDataInGivenIneterArray(int[] a){
		int[] temp = new int[10];
		int k=0;
		System.out.println();
		System.out.print("[");
		for(int i=0;i<a.length;i++){
			int count=0;
			for(int j=i;j<a.length;j++){
				if(a[i]==a[j])
					count++;
			}
			if(count==1){
				temp[k]=a[i];
				k++;
			}
		}
		a=temp;
		for(int s:temp)
			System.out.print(s+",");
		System.out.println("]");
		
	}
	public static boolean verifyPalindromeNum(int x){
		
		int i=0,k=0;
		int t=x;
		while(x>0){
			i=x%10;
			k=k*10+i;
			x=x/10;
		}
		if(t==k){
			System.out.println(k+" is palidrom number");
			return true;
		}
		else{
			System.out.println(k+" is not palidrom number");
			return false;
		}
	}
	public static boolean verifyPalindromeString(String text){
		
		String rev="";
		for(int i=text.length()-1;i>=0;i--){
			
			rev=rev+text.charAt(i);
		}
		
		if(rev.equalsIgnoreCase(text)){
			System.out.println(text+" is palidrom string");
			return true;
		}
		else{
			System.out.println(text+" is not palidrom string");
			return false;
		}
	}	
	public static void sortGivenNamesBasedOnLength(String[] names){
		
		String temp;
		for(int i=0;i<names.length;i++){
			for(int j=i+1;j<names.length;j++){
				if(names[i].length()>names[j].length()){
					temp=names[i];
					names[i]=names[j];
					names[j]=temp;
				}
			}
		}
		for(String s:names)
			System.out.print(s+", ");
		
		
		
	}
	public static void printGivenStringInAscOrder(String str){
		char ch[]=new char[str.toLowerCase().length()];
		char c;
		String res="";
		for(int i=0;i<str.length();i++)
			ch[i]=str.charAt(i);
		for(int i=0;i<ch.length;i++){
			for(int j=i+1;j<ch.length;j++)
				if((int)ch[i]>(int)ch[j]){
					c=ch[i];
					ch[i]=ch[j];
					ch[j]=c;
				}
			res=res+ch[i];
		}
		
		System.out.println(res);
		
	}
	public static void printVowelsConsonantsOfStrInAscOrder(String str){
		
		String _vowels="aeiou";
		String _v="",_c="";
		
		char ch[]=new char[str.length()];
		char c;
		for(int i=0;i<str.length();i++)
			ch[i]=str.charAt(i);
		for(int i=0;i<ch.length;i++){
			for(int j=i+1;j<ch.length;j++)
				if((int)ch[i]>(int)ch[j]){
					c=ch[i];
					ch[i]=ch[j];
					ch[j]=c;
				}
			if(_vowels.contains(ch[i]+""))
				_v=_v+ch[i];
			else
				_c=_c+ch[i];
		}
		System.out.println(_v+_c);
		
	}
	public boolean compareTwoStrings(String str1,String str2){
		
		System.out.println("First argument: ");
		
		
		return true;
	}
	public static boolean  verifyGivenIntegerArrayInAsc(int[] a){
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++)
				if(a[i]>a[j]){
					return false;
				}
		}		
		return true;
	}
	public static void main(String args[]) throws IOException{
		//sortGivenNamesBasedOnLength(new String[]{"earthworm","dog","pinki","pig"});
		//printVowelsConsonantsOfStrInAscOrder("enjoy be");
		//printGivenIntegerArrayInAsc(new int[]{2,6,0,1,5,10,7});
		//printGivenWordsInAsc(new String[]{"kukura","ghadha","sunanda","pinki","abhi","z"});
		//elemenateDuplicateDataInGivenIneterArray(new int[]{2,6,0,0,8,7,1,5,10,7});
		//System.out.println(verifyPalindromeNum(121));
		//System.out.println(verifyPalindromeString("madam"));
		
		String[] words={"a2","a1","ChromeOS","iOS","iOS","iOS", "iOS","MacOS","MacOS", "MacOS","Windows","Windows" ,"Windows","Windows","Windows","Windows","Windows"};
		//System.out.println(verifyGivenWordsInAsc(words));
		elemenateDuplicateDataInGivenIneterArray(new int[]{2,7,2,8,9,7,8,7});
		System.out.println("   123 3 4 5");
		
		
//BufferedWriter bw;
//		
//		FileInputStream br=new FileInputStream("C:\\Users\\Public.Madhu-PC\\Desktop\\SampleCode.txt");
//		char ch;
//		int i;
//		while((i= br.read())!=-1){
//			System.out.print((char)i);
//		}
//		
		
		
		
	
}

	
}
