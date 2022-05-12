import java.io.*;
class Test8{
	
	public static void main(String[] args){
     
	 
	 FileWriter fw = null; 
	 
	 try{
	    
		fw = new FileWriter("myfile.txt");
		fw.write("Hello");
	 }
	 catch(FileNotFoundException e){
	   System.out.println(e);
	 }
	 catch(IOException e){
	   System.out.println(e);
	 }
	 finally{
	   System.out.println("Finally Block");
	   try{
	     fw.close();
	   }
	   catch(IOException e){
		  System.out.println(e);
	   }
	   
	 
	 }
	 System.out.println("hello");
	 
   }
}