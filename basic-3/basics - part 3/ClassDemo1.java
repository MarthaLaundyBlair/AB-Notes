class Employee{
	int employeeId;  // lower-camel case
	String employeeName;
	double salary;
}

class ClassDemo1{
	
	
	Employee e5 = new Employee();	  
	
	public static void main(String[] args){
		
	   // Instantiation
	   Employee e1 = new Employee();	
	   
	   if(10 > 4)
	   {
		   
		  Employee e3 = new Employee();	   
		  
	   }
	   
	   e1 = null;
	   
	   // Set values into the above
	   
	   e1.employeeId = 1;
	   e1.employeeName = "Tom";
	   e1.salary = 2000;
	   
	   
	   System.out.println(e1.employeeId);
	   System.out.println(e1.employeeName);
	   System.out.println(e1.salary);
	   
	   
	   
	   
	   new Employee();
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   //////////////////////////////////////////
	   
	   System.out.println("*************************");
	   
	   
	    // Instantiation
	   Employee e2 = new Employee();	
	   
	   // Set values into the above
	   
	   e2.employeeId = 2;
	   e2.employeeName = "Alex";
	   e2.salary = 1000;
	   
	   
	   System.out.println(e2.employeeId);
	   System.out.println(e2.employeeName);
	   System.out.println(e2.salary);
	   
	   
	   
	   
	   
	   
		
	}
	
}
