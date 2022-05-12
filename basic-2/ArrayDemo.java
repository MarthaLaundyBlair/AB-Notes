class ArrayDemo{

	public static void main(String[] args){
	
	int marks[] = new int[5];
	
	marks[0] = 50;
	marks[1] = 60;
	marks[2] = 70;
	marks[3] = 80;
	marks[4] = 90;
	
	for( int index = 0; index < 5; index++){
	System.out.println(marks[index]);
	}
	
	for( int mark : marks){
	System.out.println(mark);
	}
		
	}

}
