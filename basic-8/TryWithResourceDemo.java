import java.io.*;
class TryWithResourceDemo{
	
	public static void main(String[] args){
     
	 try(
	 
	    FileWriter fw = new FileWriter("myfile.txt");
		
				
		){
	    
		fw.write("Hello");
	 }
	 catch(FileNotFoundException e){
	   System.out.println(e);
	 }
	 catch(IOException e){
	   System.out.println(e);
	 }
	 
	 System.out.println("hello");
	 
   }
}