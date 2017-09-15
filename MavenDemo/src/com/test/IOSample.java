package com.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IOSample {
	
	public static void FISEx() throws IOException{
		
		FileInputStream fis=new FileInputStream("./src/com/test/JavaDemo.java");
		
		FileOutputStream fos=new FileOutputStream("./src/test.txt");
		int i;
		while((i=fis.read())!=-1)
			fos.write((char)i);
		
		fis.close();
		fos.close();
		
	}
	
	public static void fileReaderWriter() throws IOException{
		
		FileReader fr=new FileReader("./src/com/test/JavaDemo.java");
		FileWriter fw=new FileWriter("./src/test1.txt");
		int i;
		while((i=fr.read())!=-1)
			fw.write((char)i);		
		fr.close();
		fw.close();
		
		
	}
	
	public static void bufferedIS() throws IOException{
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream("./src/com/test/JavaDemo.java"));
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("./src/JavaDemo.txt"));
		int i;
		while((i=bis.read())!=-1)
			bos.write((char)i);		
		bis.close();
		bos.close();		
	}
	public static void buffereReaderWriter()throws IOException{
		BufferedReader br=new BufferedReader(new FileReader("./src/com/test/JavaDemo.java"));
		BufferedWriter bw=new BufferedWriter(new FileWriter("./src/test3.txt"));
		String line;
		while((line=br.readLine())!=null)
			bw.write(line+"\n");
		
		br.close();bw.close();
		
	}
	
	public static void scannerEx() throws IOException{
		Scanner sc=new Scanner(new FileInputStream("./src/com/test/JavaDemo.java"));
		while(sc.hasNextLine())
			System.out.println(sc.nextLine());
	}
	public static void main(String[] args) throws IOException{
		
		scannerEx();
	}
	

}
