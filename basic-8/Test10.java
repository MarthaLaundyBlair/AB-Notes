class A implements AutoCloseable{
	@Override
	public void close(){
	  System.out.println("A");	
	}
	
}

class B implements AutoCloseable{
	
	@Override
	public void close(){
	  System.out.println("B");
	}
	
}

class Test10{
	
	public static void main(String[] args){
     
	 try( A a1 = new A(); B b1 = new B(); ){
	    
	 }
	 
	 System.out.println("hello");
	 
   }
}