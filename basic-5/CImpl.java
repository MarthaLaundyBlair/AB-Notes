public class CImpl implements C{
 
 
   
   public CImpl(){
	   
	  // To access variables of interface use "interface name"
	  System.out.println(A.x); 
	  System.out.println(B.x); 
	  
	  // As we know variables of interface are always so we don't create 
	  //an instance to access interface variables
	  
   }
 
   public void getA(){
	   System.out.println("A");
   }
   
   public void getB(){
	   
	  System.out.println("B"); 
   }
   
   public void getC(){
	   
	  System.out.println("C"); 
   }

}