import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//import java.io.*;

class WriteDataDemo{
 
 public static void main(String[] args){

   try{

   //FileOutputStream os = new FileOutputStream("file1.txt");
   FileOutputStream os = new FileOutputStream("file1.txt",true);// this will open file in append mode


   os.write("Welcome to File Handling \n".getBytes());
         
   os.close();
   
   }
   catch(FileNotFoundException e){
	   System.out.println(e);
   }
   catch(IOException e){
	  System.out.println(e);
   }
			
 }

}