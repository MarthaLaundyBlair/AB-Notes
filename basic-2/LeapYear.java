class LeapYear{

	static boolean LeapYearCalculator ( int year){
		if ( year % 4 == 0){
			if ( year % 100 != 0) {
			
				return true;
			}
			else if (year % 400 ==0){
			
			return true;
			
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	
	}

	public static void main(String[] args){
	
		int currentYear = 2022;
		int year = 1900;
		
		while (year <= currentYear) {
			if (LeapYearCalculator(year) == true){
				System.out.println( year + " was a leap year!");
			}
			else{
				System.out.println( year + " was not a leap year!");
			}
			year ++;
		}

	}
}