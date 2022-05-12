class ConditionalsTask{

	public static void main(String[] args){
		
///////////////////////////////////
		// task 1
		System.out.println("\r\n");
		System.out.println("Results for For Conditional 1 \r\n");
		
		int n = 5;
		
		if (1 <= n & n <= 5){
		System.out.println("It is not a weekend!");
		}
		else {
		System.out.println("It is the weekend!");
		}
		
	
////////////////////////////////
		// task 2
		System.out.println("\r\n");
		System.out.println("Results for For Conditional 2 \r\n");

		int day = 4;
		switch (day) {
		  case 1:
			System.out.println("It is Monday!");
			break;
		  case 2:
			System.out.println("It is Tuesday!");
			break;
		  case 3:
			System.out.println("It is Wednesday!");
			break;
		  case 4:
			System.out.println("It is Thursday!");
			break;
		  case 5:
			System.out.println("It is Friday!");
			break;
		  case 6:
			System.out.println("It is Saturday!");
			break;
		  case 7:
			System.out.println("It is Sunday!");
			break;
		}
		
//////////////////////////////////////////////////////
		// task 3
		System.out.println("\r\n");
		System.out.println("Results for For Conditional 3 \r\n");
		
		int m = 4;
		switch (day) {
		    case 6:
				System.out.println("It is the weekend!");
				break;
			case 7:
				System.out.println("It is the weekend!");
				break;
			default:
				System.out.println("It is not the weekend!");
		}
////////////////////////////////////////////////////////////
		// task 4
		System.out.println("\r\n");
		System.out.println("Results for For Conditional 4 \r\n");

		for (int count = 1; count <= 7; count++){
			System.out.println("Day "+ count );
			if (1 <= n & n <= 5){
				System.out.println("It is not a weekend!");
			}
			else {
				System.out.println("It is the weekend!");
			}
	}
	

	}
}