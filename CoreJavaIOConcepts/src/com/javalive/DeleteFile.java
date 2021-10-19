package com.javalive;

import java.io.File;

/**
 * @author JavaLive.com
 * @description In this tutorial we will see how to delete a File in java. 
 * We will be using the delete() method for file deletion.
	public boolean delete()
This method returns true if the specified File deleted successfully otherwise it returns false. 
 */
public class DeleteFile {
	public static void main(String[] args)
	   {	
	      try{
	         //Specify the file name and path
	    	 File file = new File("C:\\myfile23.txt");
	         /*the delete() method returns true if the file is
	          * deleted successfully else it returns false
	          */
	    	 if(file.delete()){
	    	    System.out.println(file.getName() + " is deleted!");
	         }else{
	    	    System.out.println("Delete failed: File didn't delete");
	    	  }
	       }catch(Exception e){
	           System.out.println("Exception occurred");
	    	   e.printStackTrace();
	    	}
	    }
}
