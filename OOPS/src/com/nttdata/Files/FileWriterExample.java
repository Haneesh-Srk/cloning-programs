package com.nttdata.Files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	void writeToFile()
	{
		try {
			FileWriter w=new FileWriter("C:/Java Softwares/srk.txt");
			w.write("Hi this is java class");
			w.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		FileWriterExample f=new FileWriterExample();
		f.writeToFile();
	}
}
