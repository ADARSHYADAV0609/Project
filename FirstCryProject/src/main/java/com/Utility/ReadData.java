package com.Utility;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadData {

	
	public void readdataProperty() throws IOException {
	Properties p  = new Properties();
	FileReader fr = new FileReader("./TestData/data.properties");
	
	
	p.load(fr);
	System.out.println(p.getProperty("baseUrl"));
}
}	
