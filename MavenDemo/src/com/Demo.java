package com;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Retention;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	
	
	@Test
	public static void fun(){
		
		//WebDriver driver=new FirefoxDriver();
		//driver.get("http://google.com");
		//driver.get("http://gmail.com");
		//driver.quit();
		System.out.println("Test1");
		Reporter.log("Commit From CMD");
		
	}
	//@Test
	public static void fun2() throws IOException{
		
//		WebDriver driver=new FirefoxDriver();
//		driver.get("http://google.com");
//		driver.quit();
		System.out.println("Test1");
		
		String cmd="";
		Process p = Runtime.getRuntime().exec("cmd /c cd E: && cd E:/MyGIT/SimpleInterviewPrograms && git diff --name-only \"@{1 day ago}\" > t.txt ");
		InputStream bis= p.getInputStream();
		int i;
		while((i=bis.read())!=-1)
			System.out.print((char)i);
		System.out.println();
		System.out.println("****************************************************************");
	}

}
