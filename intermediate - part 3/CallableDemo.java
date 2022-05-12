import java.util.concurrent.*;
class NewTarget implements Callable<String>{
	
	@Override
	public String call(){
	 
	   return "This is from Callable";
	}
}


class NewTarget2 implements Callable<String>{
	
	@Override
	public String call(){
	 
	   return "This is from Callable";
	}
}

class CallableDemo{

	public static void main(String[] args) throws Exception{

      ExecutorService service = Executors.newFixedThreadPool(10);
	  
	  
	  Future<String> result1 = service.submit(new NewTarget());
	  
	  
	  Future<String> result2 = service.submit(new NewTarget2());
	  
	  
	  Future<String> result3 = service.submit(new NewTarget());
	  
	  Future<String> result4 = service.submit(new NewTarget());
	  
	  Future<String> result5 = service.submit(new NewTarget());
	  
	  Future<String> result6 = service.submit(new NewTarget());
	  
	  
	  System.out.println(result.get());
	   
	   
	}
	

}