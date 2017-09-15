package com.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestEx {
	
	public static void main(String[] args){
		
		
		Calendar currentDate = Calendar.getInstance();
		currentDate.add(Calendar.DATE, 1);
        SimpleDateFormat formatter= new SimpleDateFormat("MM/dd/yyyy");
        String dateNow = formatter.format(currentDate.getTime());
        
        System.out.println(dateNow);
		
	}

}
