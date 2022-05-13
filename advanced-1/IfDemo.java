class IfDemo{
	public static void main(String[] args){

		int a = 200;
		int b = 200;
		int c = 300;
		
		if (a > b & a > c){
		
			System.out.println("a is greater than b and c");

		}
		else if (b > a & b > c){
			System.out.println("b is greater than a and c");

		}
		
		else if (c > a & c > b){

			System.out.println("c is greater than a and b");
			
		}
		
		else{
			System.out.println("a, b and c are equal");
		}
	}
}
