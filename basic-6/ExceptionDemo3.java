class ExceptionDemo3{
	
  public static void main(String[] args){

	try{
		System.out.println(10/0);
	}
	catch(ArrayIndexOutOfBoundsException e){
	
      System.out.println("ArrayIndexOutOfBoundsException is caught...");	
	}	

    System.out.println("Hello");	


  }  

}