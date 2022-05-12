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


class MethodsDemo2{
	
   public static void main(String[] args){
	   
	   /*
	   int a = 100;
	   
	   short x = 1000;
	   
	   double b = x + a ; 
	   
	   */
	
	
	  Methods mt = new Methods();
	  
	  //int add =  mt.sum(100,200); // Method call / Manager 
	  //printThis(add);
	  
	  printInts(mt.sum(100,200));
	  
	  System.out.println(mt.sum(100,200));
	  
	  printInts(mt.multiply(10,20));
	  
	  printInts(mt.subtract(100,200));
	  
	  printDoubles(mt.divide(100,4));
	  
	  System.out.println("Welcome");
	  
	  System.out.println(100);
	  
	  System.out.println(100.45);
	  
	  
	  
	  
	  
	  
   }
   
   public static void printInts(int result){
	  System.out.println(result);
   }
   
   
   public static void printDoubles(double result){
	  System.out.println(result);
   }
   
   
   
}