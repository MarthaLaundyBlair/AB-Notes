import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

class FileWriterDemo{
	
  public static void main(String[] args){

     

     try{
	   
	    FileWriter fw = new FileWriter("new_file.txt");
	   
	    
		fw.write("Hi \n");
		fw.write("Hello \n");
		fw.write("How are you? \n");
		fw.write("Are you enjoying File IO? \n");
		
		System.out.println("File Created Successfully!!");
		
		fw.close(); // Close the file connection to avoid data leaks
	 
	 }
	 catch(FileNotFoundException e){
	 
	    System.out.println(e.getMessage());
	 }
	 catch(IOException e){
	 
	    System.out.println(e.getMessage());
	 }
	
	
  }  

}