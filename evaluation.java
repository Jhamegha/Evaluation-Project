package project1;

import java.io.*;
import java.util.Scanner;
import java.util.*;

public class evaluation {

	public static void main(String[] args) {
		 Scanner input=new Scanner(System.in);
			     File ob=new File("C:\\Users\\Acer\\Desktop\\folder.txt\\A");
			if(ob.exists())
			{
				System.out.println("File is already exist");
			}else
				try {
					ob.mkdirs();
					
				} catch (Exception e)
			{
					e.printStackTrace();
			}
         File	ob1=new File("C:\\Users\\Acer\\Desktop\\Folder.txt\\B");
    	 ob1.mkdirs(); 
         File	ob2=new File("C:\\Users\\Acer\\Desktop\\Folder.txt\\C");
  	     ob2.mkdirs();
	         File	ob3=new File("C:\\Users\\Acer\\Desktop\\Folder.txt\\D");
	         ob3.mkdirs();
	         System.out.println("Welcome to the PROJECT EVALUATION ");
	        
	         {
	        // Scanner input=new Scanner(System.in);
	         int choice;
	         do {
	         System.out.println("Enter your choice:");
	         System.out.println("Enter-1 : If you want to retrieve all the files");
	         System.out.println("Enter-2 : If you want to perform the file operation");
	         System.out.println("Enter-3 : If you want to see the status ");
	         System.out.println("Enter key 7 if you want to exit from this program ");
	          choice=input.nextInt();
	         switch (choice) {
	         case 1:{
	        	 File file=new File ("C:\\Users\\Acer\\Desktop\\Folder.txt");
   	        	 File array[]=file.listFiles();
   	        	 System.out.println("List of files and directories in the specified directory:");
   	        	 for(int i=0;i<array.length;i++) {
   	        		 System.out.println(array[i]);
   	        		 if(array[i].isFile()) {
   	        			 System.out.println("File is : " +array[i]);
   	        		 }
   	        		 else if(array[i].isDirectory()) {
   	        			 System.out.println("Directory :"+array[i]);
   	        		 }
   	        	 }
   	        	              break;

} case 2:
	  { do {
	  
		 System.out.println("Enter your choice of file operation which you want to perform ");
		 System.out.println("Enter-1 : If you want to create or add a new file/folder");
		 System.out.println("Enter-2 : If you want to delete a  file");
	     System.out.println("Enter-3 : If you want to see all file starting with your choice");
		 System.out.println("Enter-4 : If you want to see the status");
		 System.out.println("Enter-5 : not valid enter 6 for  another menu choice");
		   choice=input.nextInt();
		   switch(choice) {
		   case 1: {
		    System.out.print("Enter the desired name of your file: ");
	        String fileName = input.next();
	        File file = new File("C:\\Users\\Acer\\Desktop\\Folder.txt\\"+fileName+".txt");
        try {
		file.createNewFile();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      break;
		   }
		   case 2:{
			 System.out.print("Enter the desired name of your file which you want to delete: ");
        String fileName = input.next();
        File file = new File("C:\\Users\\Acer\\Desktop\\Folder.txt\\"+fileName+".txt");
        if (file.delete()) 
      {   
          System.out.println(file.getName()+ " file is deleted successfully.");  
        }
      else {  
          System.out.println("Unexpected error found in deletion of the file.");  
        } 
        break;
		   }
		   case 3:{
			 System.out.print("Enter the desired name of your file : ");
       String fileName = input.next();
       File file = new File("C:\\Users\\Acer\\Desktop\\Folder.txt\\");
    
       File contents[] = file.listFiles();
       System.out.println("List of files and directories in the specified directory:");
       for(int i=0; i<contents.length; i++) {
      	 if(contents[i].getName().startsWith(fileName)) {
          System.out.println(contents[i]);
       }
		   }
       break;   
	 }
		 
case 4:{
		 System.out.println("The case 2 executed successfully");
		 break;
		
	 }case 5 : {
	     System.out.println( "this  is not the valid option! please select  another submenu option ");
	     
		
	 } 
	 
		   }}while(choice<=5);
	  break;
	  

	  }
	         
		
		 case 3:{ 
			 System.out.println("You have successfully executed this program");
             break;
}
default:{
System.out.println("Thank you");
break;

}   }  }while(choice<=6);
	          
}
	   
	
}
	}
