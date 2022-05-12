import java.io.*;
class SerializationDemo{

  public static void main(String[] args){
	
	try{
	    
		// This step will open a file "emp.dat" in write mode
		FileOutputStream fs = new FileOutputStream("emp.dat");
		
		// This step establishes a connection betweeen FileOutputStream and ObjectOutputStream
		// This step is a required so employee object can be stored in file 
		ObjectOutputStream os = new ObjectOutputStream(fs);
		
		
		Employee e1 = new Employee(1,"Kishore");

       
        // Use ObjectOutputStream to store employee object in a file	   
		
		os.writeObject(e1); // This will send e1 object to "emp.dat"
		
		
		System.out.println("Object is serialized");
	}
	catch(FileNotFoundException e){
	
	   System.out.println(e);
	}
	catch(IOException e){
	
	   System.out.println(e);
	}
	
  }
	
}
