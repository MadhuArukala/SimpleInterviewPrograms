package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringEx {
	
	
	
	public static Boolean verifyRelatedObjInfo(String actualObj, String expectedObj)throws Exception{
		String[] aObj=actualObj.split("\n");
		String[] eObj=expectedObj.split(";");
		List<String> actlObjects = new ArrayList<String>(Arrays.asList(aObj)); 
		if(aObj.length==eObj.length){
			for(int i=0;i<aObj.length;i++){
				if(!actlObjects.contains(eObj[i])){
					return false;
				}
			}
			
		}else{
			
			throw new Exception("actual("+aObj.length+") Objects count was not matched with expected("+eObj.length+") objects count ");
		}		
		return true;
	}
	
	public static void main(String[] args)throws Exception{
		
		String x="a";
		String y=new String("a");
		
		
		System.out.println(x.equals(y));
		
		//System.out.println(verifyRelatedObjInfo("abc\nxyz\npqr\n","xyz;abc;pqr"));
		
	}
	

}
