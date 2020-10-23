package com.nttdata.Files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	void readFromFile()
	{
		try {
			FileReader fr=new FileReader("C:/Java Softwares/srk.txt");
			int i;
			while((i=fr.read())!=-1)
			{
				System.out.print((char)i);
			}
			fr.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		FileReaderExample f=new FileReaderExample();
		f.readFromFile();
	}
}
