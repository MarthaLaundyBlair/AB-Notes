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
		else if (c == a & c != b) {
			System.out.println("c and a are equal");
		}
		else if (b == a & a != b) {
			System.out.println("b and a are equal");
		}
		else if (c == b & c != a) {
			System.out.println("c and b are equal");
		}
		else{
			System.out.println("a, b and c are equal");
		}
	}
}
