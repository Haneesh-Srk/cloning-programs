package com.nttdata.Files;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {

	void writeToFile() 
	{
		try {
			FileInputStream in = new FileInputStream("C:/Java Softwares/srk.txt");
			int i=in.read();
			System.out.println((char)i);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}	
	
	public static void main(String[] args) {
		FileInputStreamExample f=new FileInputStreamExample();
		f.writeToFile();
	}
}
