class Outer{

  private int x; // Non-static
  
  private static int y = 2000;
  
  // An inner class can be referred as a member of outer class
  // An inner class can be declared as 
  // An inner class can access the member variables and methods of an outer class including private
  class NonStaticInner{
    
	public void display(){
	
		System.out.println(x); // 0
	}
	
  }
     
  // Treat this class as a static member	
  // A static class can access only static members (variables and methods)  
  static class StaticInner{
    
	public void display(){
	
		//System.out.println(x); // Error
		System.out.println(y); // 2000
	}
	
  }
    
}
class InnerClasses{
	
	public static void main(String[] args){
		
	  	// Create an object from Outer class 

        Outer out = new Outer();

        //out.x = 1000;
		// To create an inner class (non-static) object first we need to create outer class object 
		// And then create inner class object
		Outer.NonStaticInner inner = out.new NonStaticInner();
		
		inner.display();
		
	     
        // To create an instance from a static inner class we don't need outer class object  		 
		Outer.StaticInner staticInner = new Outer.StaticInner();
		
		
		
		//static int x  = 3000; // Error
				
		
		staticInner.display();
		
		
        		
	}
	
}