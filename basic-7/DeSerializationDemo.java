import java.io.*;
class DeSerializationDemo{

  public static void main(String[] args){
	
	try{
	    
		// This step will open a file "emp.dat" in READ mode
		FileInputStream is = new FileInputStream("emp.dat");
		
		// This step establishes a connection betweeen FileOutputStream and ObjectOutputStream
		// This step is a required so employee object can be stored in file 
		ObjectInputStream ois = new ObjectInputStream(is);
				
		// Use ObjectInputStream to re-store employee object from a file	   
		// readObject() method always return "Object" type and this needs to be type casted
		Employee e1 = (Employee) ois.readObject(); // This will read employee object from "emp.dat"
		
		System.out.println("Object has been  De-serialized");
		
		System.out.println(e1);
		
	}
	catch(FileNotFoundException e){
	
	   System.out.println(e);
	}
	catch(IOException e){
	
	   System.out.println(e);
	}
    catch(ClassNotFoundException e){
		
		System.out.println(e);
	}
  
	
  }
	
}
