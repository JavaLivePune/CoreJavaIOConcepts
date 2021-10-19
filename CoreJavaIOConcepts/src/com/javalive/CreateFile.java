package com.javalive;


import java.io.File;
import java.io.IOException;



/**
 * @author JavaLive.com
 * @description In this tutorial we will see how to create a file in Java using createNewFile() method. 
 * This method creates an empty file, if the file doesn’t exist at the specified location and returns true. 
 * If the file is already present then this method returns false. It throws:

IOException – If an Input/Output error occurs during file creation.
SecurityException – If a security manager exists and its SecurityManager.checkWrite(java.lang.String)
method denies write access to the file.
 */
public class CreateFile {
	public static void main( String[] args )
	   {	
	      try {
		     File file = new File("C:\\newfile.txt");
		     /*If file gets created then the createNewFile() 
		      * method would return true or if the file is 
		      * already present it would return false
		      */
	             boolean fvar = file.createNewFile();
		     if (fvar){
		          System.out.println("File has been created successfully");
		     }
		     else{
		          System.out.println("File already present at the specified location");
		     }
	    	} catch (IOException e) {
	    		System.out.println("Exception Occurred:");
		        e.printStackTrace();
		  }
	   }
}
