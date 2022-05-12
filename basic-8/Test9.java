import java.io.*;


class A implements AutoCloseable{
	@Override
	public void close(){
		
	}
	
}

class B implements AutoCloseable{
	
	@Override
	public void close(){
		
	}
	
}


class Test9{
	
	public static void main(String[] args){
     
	 try( A a1 = new A(); B b1 = new B(); ){
	    
	 }
	 
	 System.out.println("hello");
	 
   }
}