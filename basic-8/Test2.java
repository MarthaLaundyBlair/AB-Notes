class Test2{
	
 public static void main(String[] args){
 
    int a = 10;
	
	if(a == 10){
	   
	  int b = 20; // Local to if statement
	  
	  System.out.println(a); 
	  System.out.println(b); 
		
	}
 
	System.out.println(a); 
	System.out.println(b); // Error, cannot find symbol "b"
	
	
 }
 

}