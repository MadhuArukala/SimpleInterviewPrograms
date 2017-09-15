package com.test;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;
public class FileDemo {
	
	public static void readContentFromFile() throws IOException{
	    //DataInputStream dis = new DataInputStream(System.in);
	    FileInputStream fout = new FileInputStream("C:\\Users\\Public.Madhu-PC\\Desktop\\SampleCode.txt");
	    System.out.println("Enter text (enter & to end):");
	    int ch;
	    while ((ch=fout.read())!=-1){
	    	System.out.print((char)ch);	
	    }
	   fout.close();
	}
	
	public static void main(String[] args) {
		String xpath="//GridSize/X/text()";
		String filepath="C:\\Users\\Public.Madhu-PC\\Desktop\\javaTestFiles\\testxml2.src";

		System.out.println(verifyXMLTagVal(filepath,xpath,"13"));
		
		
		//xpath="//Recipe[contains(Path,'CA-ETM')]/Elements/TestsList/Test/SamplingPlan/InspectionSites/Site";
		//System.out.println(getXMLNodeCount(filepath,xpath));
	}
	
	public static boolean verifyXMLTagVal(String filePath, String xpath, String verifyVal) {
		boolean flag=false;
		try{
			DocumentBuilderFactory docBFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docBFactory.newDocumentBuilder();
			Document doc = docBuilder.parse(new File(filePath));
			XPathFactory xpathFactory = XPathFactory.newInstance();
			XPath _xpath = xpathFactory.newXPath();
			XPathExpression expr = _xpath.compile(xpath);
			NodeList nodes = (NodeList) expr.evaluate(doc, XPathConstants.NODESET);
			System.out.println("Expected Node value: "+verifyVal);
	        for (int i = 0; i < nodes.getLength(); i++){
	        	System.out.println("Node value from xml: "+nodes.item(i).getNodeValue().trim());
	        	 if(nodes.item(i).getNodeValue().trim().equals(verifyVal.trim())){
	        		 System.out.println("Encountered expected node value in given xml file ");
	        		return true;
	        	 }
	         }  
	        
		}catch(Exception e){
			e.printStackTrace();
		}
		return flag;
	}
	
	public static int getXMLNodeCount(String filePath, String xpath) {
		try{
			DocumentBuilderFactory docBFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docBFactory.newDocumentBuilder();
			Document doc = docBuilder.parse(new File(filePath));
			XPathFactory xpathFactory = XPathFactory.newInstance();
			XPath _xpath = xpathFactory.newXPath();
			XPathExpression expr = _xpath.compile(xpath);
			NodeList nodes = (NodeList) expr.evaluate(doc, XPathConstants.NODESET);
			System.out.println("Given XML Node count: "+nodes.getLength());
			return nodes.getLength();
	             
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return 0;
		
	}
	
	public static boolean verifyElementVal(String parentNode, String tagName, String tarVal){
		boolean flag=false;
		try{
			DocumentBuilderFactory docBFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docBFactory.newDocumentBuilder();
			Document doc = docBuilder.parse(new File("C:\\Users\\Public.Madhu-PC\\Desktop\\javaTestFiles\\testxml2.src"));
			doc.getDocumentElement().normalize();
	
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
					
			NodeList nodeList = doc.getElementsByTagName(parentNode);
			if(nodeList.getLength()==0)
				System.out.println("'"+parentNode+"' node is not existed ");
			
			for (int t = 0; t < nodeList.getLength(); t++) {
				Node nNode = nodeList.item(t);	
				System.out.println("Current Element :" + nNode.getNodeName());	
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					if(eElement.getElementsByTagName(tagName).getLength()==0){
						System.out.println("'"+parentNode+"' tag did not have "+tagName+" child tag ");
						break;
					}
					if(eElement.getElementsByTagName(tagName).item(0).getTextContent().trim().equals(tarVal.trim()))
						flag=true;
	
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return flag;
	}

}
