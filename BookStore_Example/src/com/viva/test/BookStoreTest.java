package com.viva.test;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class BookStoreTest {
	public static void main(String[] args) {
		
		TransformerFactory factory=TransformerFactory.newInstance();
		StreamSource xslStream=new StreamSource("bookstore.xsl");
		StreamSource in = new StreamSource("bookstore.xml");
		StreamResult out= new StreamResult(System.out);
		
		try {
			Transformer transformer=factory.newTransformer(xslStream);
			transformer.transform(in,out);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
