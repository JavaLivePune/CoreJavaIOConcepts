package com.javalive;

import java.io.File;

/**
 * @author JavaLive.com
 * @description Earlier we saw how to create, read, write, append to a file in java. 
 * In this tutorial we will see how to rename a file in java using renameTo() method.
   public boolean renameTo(File dest)
   It returns true if the file is renamed successfully else it returns false. It throws NullPointerException – If parameter dest is null.
 */
public class RenameFile {
	 public static void main(String[] args)
	    {	
	        //Old File
		File oldfile =new File("C:\\myfile.txt");
		//New File
		File newfile =new File("C:\\mynewfile.txt");
		/*renameTo() return boolean value
		 * It return true if rename operation is
		 * successful
		 */
	        boolean flag = oldfile.renameTo(newfile);
		if(flag){
		   System.out.println("File renamed successfully");
		}else{
		   System.out.println("Rename operation failed");
		 }
	    }
}
