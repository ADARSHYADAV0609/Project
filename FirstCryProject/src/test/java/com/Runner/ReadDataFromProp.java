package com.Runner;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Properties p  = new Properties();
		FileReader fr = new FileReader("./TestData/data.properties");
		
		
		p.load(fr);
		System.out.println(p.getProperty("baseUrl"));
		
		System.out.println(p.getProperty("Mobile"));
		

	}

}
