import java.util.*;
class StreamsDemo2{
	
 public static void main(String[] args){
	
	// Create a List using short-cut
	
	List<Integer> numbers = Arrays.asList(1,2,3,4,5);
	
	
	// Code to find sum of all numbers
	
	int sum = 0;
	
	for(int i : numbers){
		
	  sum = sum + i;	
	
	}
	
	System.out.println(sum);
	
	// Code using Java 8 Stream 
	
	
	double result = numbers.stream()
	       .mapToDouble(n -> n)
		   //.filter(n -> n > 2)
		   //.filter(n -> n <= 10)
		   .sum();
		   
/*		   
    double result = numbers.stream()
	       .mapToDouble(n -> n)
		   .filter(n -> n > 2 && n <=10)
		   .sum();
*/		   
    System.out.println(result);
	
	
	
	
	double result2 = numbers.parallelStream()
	       .mapToDouble(n -> n)
		   .sum();
		   
	
	System.out.println(result2);
	
	
	
	
	System.out.println("FindOne method");
	
	
	//(1,2,3,4,5);
    System.out.println(
			numbers.stream()
			       .findAny());
				   
	
	System.out.println("Parallel Stream Test");
	System.out.println(
			numbers.parallelStream()
			       .findAny());	
	
 }

}