class StringDemo{

   public static void main(String[] args){
		
	String s1 = "hello";
   
    // Use case 1 - Immutability
    s1.toUpperCase();
     
    System.out.println(s1); // hello
	
	
	s1 = s1.toUpperCase();
     
    System.out.println(s1); // HELLO
	
	
	// Use case 2 - about "new" to create String object
	
	
	String s2 = "hello"; // String literal
	
	String s3 = new String("hello");
	
	String s4 = "hello";
	
	
	System.out.println(s2 == s3); // false
	
	
	System.out.println(s2 == s4); // true
	
	
	String s5 = s3;
	
	
	s5 = "bye";
	
	
	s3 = null;
	
	
	
   
   }


}