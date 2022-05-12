public class AnonymousClassDemo{
   
   public static void main(String[] args){
		
	CalculatorImpl c1 = new CalculatorImpl();
	
	System.out.println(c1.add(100,200));
	
	
	
	//Calculator c2 = new Calculator(); // Error
	
	// A reference of interface can refer to its implementation class objects
	Calculator c2 = new CalculatorImpl();
	
	
	System.out.println(c2.add(100,200));
	
	
	Calculator c3 = new Calculator(){
		
		public int add(int a,int b){
	  
			return a + b;
	  
		}
		
	};
	
	
	
	System.out.println(c3.add(1000,2000));
	


   	
	Calculator c4 = new Calculator(){
		
		public int add(int a,int b){
	  
			return a + b;
	  
		}
		
	};
	
	
	
	
   }


}