package com.javalive;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author JavaLive.com
 * @description In this tutorial we will see two ways to read a file using BufferedReader.

Method 1: Using readLine() method of BufferedReader class.
public String readLine() throws IOException
It reads a line of text.

Method 2: Using read() method
public int read() throws IOException
It reads a character of text. Since it returns an integer value, it needs to be explicitly cast as char for reading the content of file.

 Here I have two txt files myfile.txt and myfile2.txt. In order to demonstrate both the ways to read file. 
 I’m reading first file using readLine() method while the second file is being read using read() method.
 
 Note: Character Streams  These handle data in 16 bit Unicode. 
 Using these you can read and write text data only.
 */
public class ReadFileUsingBufferedReader {
	public static void main(String[] args) {

	       BufferedReader br = null;
	       BufferedReader br2 = null;
	       try{	
	           br = new BufferedReader(new FileReader("C:\\myfile.txt"));		

	           //One way of reading the file
		   System.out.println("Reading the file using readLine() method:");
		   String contentLine = br.readLine();
		   while (contentLine != null) {
		      System.out.println(contentLine);
		      contentLine = br.readLine();
		   }

		   br2 = new BufferedReader(new FileReader("C:\\myfile2.txt"));

		   //Second way of reading the file
		   System.out.println("Reading the file using read() method:");
		   int num=0;
		   char ch;
		   while((num=br2.read()) != -1)
		   {	
	               ch=(char)num;
		       System.out.print(ch);
		   }

	       } 
	       catch (IOException ioe) 
	       {
		   ioe.printStackTrace();
	       } 
	       finally 
	       {
		   try {
		      if (br != null)
			 br.close();
		      if (br2 != null)
			 br2.close();
		   } 
		   catch (IOException ioe) 
	           {
			System.out.println("Error in closing the BufferedReader");
		   }
		}
	   }
}
