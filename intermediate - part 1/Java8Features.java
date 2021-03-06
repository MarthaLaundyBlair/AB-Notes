class Java8Features{
	
	public static void main(String[] args){
	
	   Calculator c1 = new Calculator(){
		   
		  public int add(int a,int b){
			  
			return a + b;
		  }
		   
	   };
	   
	  // Since Java 8 - we can use Lambda Expression/Function
	  Calculator c2 = (int a,int b) -> { return a + b; };
		   
	
	  System.out.println(c1.add(1000,2000));
	  System.out.println(c2.add(1000,2000));
	  
	  
	  
	  Calculator c3 = (a,b) -> { return a + b; };
	  
	  
	  Calculator c4 = (a,b) -> a + b; 
	  
	  // public void getA();
	  A a1 = () -> System.out.println("Welcome");
	  
	  
	  
	  
	  List<String> names = Arrays.asList("Kishore","Alex","Tom");
	  
	  
	 


      List<String> names = new ArrayList<>();
	  
	  names.add("Kishore");
	  names.add("Alex");
	  names.add("Tom");
	  
	  
	  // Option #1 - for - each 
	  
	  for(String name : names){
		System.out.println(name);
	  }
	    
	  // Option #2 - Use Iterator 
	    
	  Iterator<String> it = names.iterator();
	  
	  
	  while(it.hasNext()){
		  
		System.out.println(it.next());
		
	  }
	  
	  
	  // Option #3 - Normal for loop 
	  for(int i = 0; i < names.size(); i++){
		  
		System.out.println(names.get(i));  
	  }
	  
	  
	  // Option #4 - Using Java 8 approach 
	  
	  
	  names.forEach(name -> System.out.println(name));
	  
	  
	  
	  // Option #5 - Using forEach method with an anonymous inner class
	  
	  names.forEach(new Consumer<String>(){
		
        public void accept(String name){

			System.out.println(name);
		}			
		  
	  }
	  
	  );
	  
	  	  
	  names.forEach((String name) -> {System.out.println(name);});
	  
	  
	  names.forEach(name -> System.out.println(name));
	  
	  
	  // :: method reference
	  names.forEach(System.out::println);
	    
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	
	}

}