class Test7{

   public static void main(String[] args){
     
	 try{
	 
		//System.out.println(10/0);
		
		System.out.println(10/2);
		
		int a = Integer.parseInt("ababab");
		
		System.out.println("No Exception");
		
		
	 }
	 catch(ArithmeticException e){
	 
	   System.out.println("Arithmetic Exception");
	 
	 }
	 finally{
	 
	   System.out.println("Finally Block");
	 
	 }
	 
	 System.out.println("hello");
	 
   }
}