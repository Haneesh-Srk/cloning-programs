package com.nttdata.Files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderExample {
	
	String line="";
		
	void ReadFile()
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the data");
		try {
			line=br.readLine();
			System.out.println();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	void writeToFile()
	{
		try {
			FileWriter w=new FileWriter("C:/Java Softwares/srk27.txt");
			w.write(line);
			System.out.println();
			w.write("file written");
			w.close();
			} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	void readFromFile()
	{
		try {
			FileReader fr=new FileReader("C:/Java Softwares/srk27.txt");
			int i;
			int count=0;
			System.out.println("data from file is");
			while((i=fr.read())!=-1)
			{
				System.out.print((char)i);
				if((char)i=='a'||(char)i=='e'||(char)i=='i'||(char)i=='o'||(char)i=='u')
				{
					count++;
				}
			}
			fr.close();
			System.out.println();
			System.out.println("No of vowels are :"+count);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
			
	public static void main(String[] args) 
	{
		BufferReaderExample b=new BufferReaderExample();
		b.ReadFile();
		b.writeToFile();
		b.readFromFile();
		
	}
		
		
}