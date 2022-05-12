class ExceptionDemo5{
	
  public static void main(String[] args){

	try{
		
		// args[0] gives first command line argument
		// args[1] gives second command line argument
		/*
		  Command-Line arguments?
		  
		  Arguments which are provided/supplied during runtime using
		  command-prompt or some project settings
		  
		  Example:
		  
		  java ExceptionDemo5 100 20 30
		
		*/	
		
		// Here, parseInt is a static method defined in Integer 
		int a = Integer.parseInt(args[0]);
		
		int b = Integer.parseInt(args[1]);
		
		System.out.println(a / b);
		
		System.out.println("No Exception");
	}
	
	catch(ArrayIndexOutOfBoundsException e){
	
      System.out.println("ArrayIndexOutOfBoundsException is caught... "+e.getMessage());	
	}
		
	catch(ArithmeticException e){
	
      System.out.println("ArithmeticException is caught... "+e.getMessage());	
	}
	
	
	catch(Exception e){
		
	  System.out.println(e.getMessage());	 

	}
   	
	System.out.println("Hello");	


  }  

}
// java ExceptionDemo5 10 5 - 2, No Exception and Hello 

// java ExceptionDemo5 - ArrayIndexOutOfBoundsException is caught... ..... Hello

// java ExceptionDemo5 10 0 - ArithmeticException is caught... ... Hello

// java Exceptiondemo5 10 abc - 
