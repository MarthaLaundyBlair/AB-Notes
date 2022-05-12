class ExceptionDemo4{
	
  public static void main(String[] args){

	try{
		System.out.println(10/0);
	}
	catch(ArithmeticException e){
	
      System.out.println("ArithmeticException is caught... "+e.getMessage());	
	}
	catch(ArrayIndexOutOfBoundsException e){
	
      System.out.println("ArrayIndexOutOfBoundsException is caught... "+e.getMessage());	
	}	

    System.out.println("Hello");	


  }  

}