class Service{

    // Step 1
   // A field which refers to it's own class
   private static Service s1;
   
   
   // Step 2
   private Service(){
   
   }
   
   // Step 3
   
   public static Service getInstance(){
	
	  if(s1 == null){
	  
     	  s1 = new Service();
	  }
	  
	  return s1;
   
   }
   
}