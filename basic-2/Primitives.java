class Primitives{

	// method for task 2
	private static double YCoord(double m, double x, double c){
	 double y = m*x +c;
	 
	 return y;
	
	}
	
	// method for task 3
	private static void Weather(boolean happy, boolean isRaining){
		
		if ( happy == true & isRaining == true){
			System.out.println("It is raining and we are happy!");
		}
		else if ( happy != true & isRaining == true){
			System.out.println("It is raining and we are not happy!");
		}
		else if ( happy == true & isRaining != true){
			System.out.println("It is not raining and we are happy!");
		}
		else if ( happy != true & isRaining != true){
			System.out.println("It is not raining and we are not happy!");
		}
	
	}

	public static void main(String[] args){
		//////////////////////////////////////////////////////
		// task 1
		System.out.println("\r\n");
		System.out.println("Results for For Task 1 \r\n");
			

		int age = 21;
		String name = "Martha";
		
		System.out.println( "Hello my name is " + name + "!");
		System.out.println( "Hello my age is " + age + "!");
		
		age = 22;
		System.out.println( "Hello my age is now " + age + "!");
		
		/////////////////////////////////////////////////////////////
		// task 2
		System.out.println("\r\n");
		System.out.println("Results for For Task 2 \r\n");
			
		
		double y;
		y = YCoord(1, 0.5, 15);
		System.out.println( "YCoord is " + y);
		
		///////////////////////////////////////////////////////////////////
		// task 3
		System.out.println("\r\n");
		System.out.println("Results for For Task 3 \r\n");
			
		
		boolean happy = true;
		boolean isRaining = true;
		
		Weather(happy, isRaining);
	

	}
}