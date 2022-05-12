class Methods{

/*	V1
   public void calculate(int a, int b){
	
	  System.out.println(" "+ (a + b) );
	  System.out.println(" "+ (a * b) );
	  System.out.println(" "+ (a / b) );
	  System.out.println(" "+ (a % b) );
	 	
   }
 */
 
 
  public void sum(int a,int b){
	
	System.out.println(" "+ (a + b) );  
  
  }
  
  public void subtract(int a,int b){
	
	
	System.out.println(" "+ (a - b) );  
  
  }
  
  
   public void multiply(int a,int b){
	
	System.out.println(" "+ (a * b) );  
  
   }
   
   
   public void divide(int a,int b){
	
	System.out.println(" "+ (a / b) );  
  
   }
   

}


class MethodsDemo{
	
   public static void main(String[] args){
	
	
	  Methods mt = new Methods();
	  
	  mt.sum(100,200);
	  
	  mt.multiply(10,20);
	  
	  mt.divide(100,200);
	  
	  mt.subtract(100,200);
   }
}