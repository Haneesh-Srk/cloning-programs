 package com.nttdata.Files;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInOutStream {

	void writeData()
	{
		DataOutputStream dout;
		try
		{
		dout = new DataOutputStream(new FileOutputStream("task.txt"));
		dout.writeInt(12);
		dout.writeBoolean(true);
		dout.writeChar('A');
		dout.writeDouble(26.7);
		dout.writeLong(123456);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	
	void readData()
	{
		try
		{
			DataInputStream din = new DataInputStream(new FileInputStream("task.txt"));
			int a = din.readInt();
			boolean b = din.readBoolean();
			char c = din.readChar();
			double d =din.readDouble();
			long e = din.readLong();
			din.close();
			System.out.println("value read from files are "+a+"\t"+b+"\t"+c+"\t"+d+"\t"+e);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		DataInOutStream d = new DataInOutStream();
		//d.writeData();
		d.readData();
	}
}
