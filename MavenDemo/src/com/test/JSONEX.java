package com.test;

	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;
	import java.util.Iterator;
	import org.json.simple.JSONArray;
	import org.json.simple.JSONObject;
	import org.json.simple.parser.JSONParser;
	import org.json.simple.parser.ParseException;

	public class JSONEX {
	     public static void main(String[] args) {
	    	 
	    	 System.out.println(verifyJsonObjContent("C:\\Users\\Public.Madhu-PC\\Desktop\\test.json","xyz/site/pdName","CA-ALDBARRDEPM"));
	     }
	     
	     public static boolean verifyJsonObjContent(String jsonFilePath, String elePath,String expVal)  {
	    	 JSONParser parser = new JSONParser();
	    	 try {
			    	 JSONObject jsonObject = (JSONObject) parser.parse(new FileReader(jsonFilePath));
		    		 String[] path=elePath.split("/");
		    		 int count=path.length;
		    		 System.out.println("Key: "+path[count-1]);
		    		 System.out.println("Expected value: "+expVal);
		    		 if(!jsonObject.containsKey(path[0]))
		    			 System.out.println("Invalid Key: "+path[0]);
		    		 if(count==1 && jsonObject.containsKey(path[0])){
	    				 return ((String)jsonObject.get(path[0])).contains(expVal);
		    		 }
		    		 JSONArray msg=null;					    		 
		    		 for(int i=0;i<count-1;i++){
		    			 if(jsonObject.containsKey(path[i])){
							msg = (JSONArray) jsonObject.get(path[i]);
							jsonObject = (JSONObject) msg.iterator().next();
						}
		    			 else{
		    				 System.out.println("Invalid Key: "+path[i]+". "
		    				 		+ "\n Please check the entire path and path should be start from the root element");
		    				 return false;
		    			 }
		    		 }
		    		 Iterator<Object> iterator = msg.iterator();
			    	 while (iterator.hasNext()) {
			    		 Object value=(Object)((JSONObject)iterator.next()).get(path[count-1]);
			    		 System.out.println("Searching for specified key value in JSON file: "+value);
			    		 
			    		 if(value.toString().contains(expVal))
			    			 return true;
			    	 }
		    		 
			    	 System.out.println(path[count-1]+"key was not found with the "+expVal+" value in given JSON file");
		  
			    	 
	    	 }catch (Exception e) {
	    	          e.printStackTrace();
	    	   }
	    	 	
	    	 return false;
	     }


	}

