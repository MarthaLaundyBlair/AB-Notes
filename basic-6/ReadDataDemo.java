import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//import java.io.*;
class ReadDataDemo{
 
 public static void main(String[] args){

   try{

   
   FileInputStream is = new FileInputStream("file1.txt");

   int i;
   
   // Iterates through file content by reading "byte - by - byte"
   while((i = is.read()) != -1){ // -1 indicates EOF marker
	   System.out.print( (char) i );
   }
   
         
   is.close();
   
   }
   catch(FileNotFoundException e){
	   System.out.println(e);
   }
   catch(IOException e){
	  System.out.println(e);
   }
			
 }

}