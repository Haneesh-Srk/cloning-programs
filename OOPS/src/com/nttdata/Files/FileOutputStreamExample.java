package com.nttdata.Files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {

	void writeToFile() 
	{
		try {
			FileOutputStream out = new FileOutputStream("C:/Java Softwares/srk1.txt");
			out.write(65);
			out.close();
			System.out.println("file written");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}	
	
	public static void main(String[] args) {
		FileOutputStreamExample f=new FileOutputStreamExample();
		f.writeToFile();
	}
}
