class LoopingTask{

	public static void main(String[] args){
	
	// task 1
	System.out.println("\r\n");
	System.out.println("Results for While loop 1 \r\n");
	
	int n = 1;
	
	while ( n <10){
		int m = n + 10;
		System.out.println("The current value of n is " + n);
		System.out.println("The value of n add 10 is " + m);
		n ++;
	
	}
	
	/////////////////////////////////////////////////////////
	// task 2
	System.out.println("\r\n");
	System.out.println("Results for While loop 2 \r\n");
	
	int p = 1;
	int k = 1;
	
	while (p < 10){
		
		k = k*2;
		
		System.out.println("The current value of p is " + p);
		System.out.println("The value 2^" + n + " is " + k);
		p ++;
	}
	
	/////////////////////////////////////////////////////////////
	// task 3
	System.out.println("\r\n");
	System.out.println("Results for For loop 1 \r\n");
	
	for (int count = 1; count < 10; count++){
		int countAdd10 = count + 10;
		System.out.println("The current value of n is " + count);
		System.out.println("The value of n add 10 is " + countAdd10);
	}
	
	
	///////////////////////////////////////////////////////////////////
	// task 4
	System.out.println("\r\n");
	System.out.println("Results for For loop 2 \r\n");
	
	int twoPowerN = 1;
	
	for (int count = 1; count < 10; count++){
		
		twoPowerN = twoPowerN*2;
		
		System.out.println("The current value of n is " + count);
		System.out.println("The value 2^" + count + " is " + twoPowerN);
	
	}
	
	
	}


}