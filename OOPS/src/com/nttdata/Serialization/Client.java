package com.nttdata.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Client {

	public static void main(String[] args) {
	
		Employee employee = new Employee(12,25, "Haneesh",22);
		String fileName="Object.txt";
		try {
			FileOutputStream fout = new FileOutputStream(fileName);
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(employee);
			out.close();
			fout.close();
			System.out.println("Object has been serialized \n"+"Data before deserialization");
			employee.print(employee);
		} 
		catch (IOException e) {
			
			e.printStackTrace();
		}
	
	employee = null;
	try 
	{
		FileInputStream fin = new FileInputStream(fileName);
		ObjectInputStream obj = new ObjectInputStream(fin);
		try {
			employee = (Employee)obj.readObject();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		obj.close();
	}
	catch (IOException e)
	{
		e.printStackTrace();
	}
	System.out.println("Data after deserialization");
	employee.b=56;
	employee.print(employee);
}
}