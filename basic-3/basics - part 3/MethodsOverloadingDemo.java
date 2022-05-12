class Methods{
 
  // Worker
  public int sum(int a,int b){
	
	return a + b;  
  
  }
  
  public int subtract(int a,int b){
	
	
	return a - b;   
  
  }
  
  
   public int multiply(int a,int b){
	
	return a * b;  
  
   }
   
   
   public double divide(int a,int b){
	
	return a / b;  
  
   }
   

}


class MethodsOverloadingDemo{
	
   public static void main(String[] args){
	   
		
	  Methods mt = new Methods();
	  
	  printResult(mt.sum(100,200));
	  
	  System.out.println(mt.sum(100,200));
	  
	  printResult(mt.multiply(10,20));
	  
	  printResult(mt.subtract(100,200));
	  
	  printResult(mt.divide(100,4));
	  
	  System.out.println("Welcome");
	  
	  System.out.println(100);
	  
	  System.out.println(100.45);
	  
	  	  
   }
   
   // Method Overloading
   
   public static void printResult(int result){
	  System.out.println(result);
   }
   
   
   public static void printResult(double result){
	  System.out.println(result);
   }
   
   
   
   
   
}