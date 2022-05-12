import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;

class FileReaderDemo{
	
  public static void main(String[] args){
  

     try{
	   
	    FileReader fr = new FileReader("new_file.txt");
	   
	    BufferedReader br = new BufferedReader(fr);
		
		
		//StringBuilder sb = new StringBuilder();
		StringBuffer sb = new StringBuffer();
		
		String line;
		
		while((line = br.readLine()) != null){ // != null Not an EOF marker
		  
		  sb.append(line+" \n");
		
		}
		
		System.out.println(sb);
		
		fr.close(); // Close the file connection to avoid data leaks
	 
	 }
	 catch(FileNotFoundException e){
	 
	    System.out.println(e.getMessage());
	 }
	 catch(IOException e){
	 
	    System.out.println(e.getMessage());
	 }
	
	
  }  

}