public class InterfaceDemo1{

	
	
	public static void main(String[] args){
	   
		//CalculatorService cs = new CalculatorService();
	
	
	   CalculatorServiceImpl cs = new CalculatorServiceImpl();
	   
	   
	   System.out.println(cs.add(100,200));
	   
	   System.out.println(cs.sub(100,200));
	   
	   System.out.println(cs.div(100,200));
	   
	   System.out.println(cs.mult(100,200));
	   
	   
	   
	}
	
	

}