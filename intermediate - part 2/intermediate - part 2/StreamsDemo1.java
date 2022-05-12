import java.util.*;
import java.util.stream.*;
class StreamsDemo1{

  
   public static void main(String[] args){
   
	
	List<String> names = Arrays.asList("Kishore","Mike","Tom","Phil","Mark");
   
   
   /* for(String name : names){
		
		
		if(name.startsWith("M")){
			
			System.out.println(name);
				
		}
	
		
	}
	*/
	
	// Write Java 8 version using Streams 
	
	
	names.stream() // Here, names is a data source
	     .filter(name -> name.startsWith("M")) // filter is an intermediate operation
		 .forEach(name -> System.out.println(name)); // forEach is a terminal operation
	
	
    
	
	List<Integer> numbers = Arrays.asList(1,2,3,4,5);
	
	
	numbers.stream()
	       .map(n -> n * 2) // map used to tranform a value
		   .forEach(n -> System.out.println(n));
	
   
    System.out.println("********");
    
	numbers.stream()
	       .map(n -> n * 2) // map used to tranform a value
		   .filter(n -> n > 6)
		   .forEach(n -> System.out.println(n));
   
   
   
    
	System.out.println("#####################");
	
	
	numbers.stream()
	       .map(n -> n * 2) // map used to tranform a value
		   .peek(n -> System.out.println("^^^^^ "+n))
		   .filter(n -> n > 6)
		   .forEach(n -> System.out.println("%%%% "+n));
		   
		   
	
	Stream<Integer> strNumbers = numbers.stream();
	
	
	Stream<Integer>  mapStream = strNumbers.map(n -> n * 2); // map used to tranform a value

	Stream<Integer> peekStream = mapStream.peek(n -> System.out.println("^^^^^ "+n));

	Stream<Integer> filteredStream =  peekStream.filter(n -> n > 6);
		   
    filteredStream.forEach(n -> System.out.println("%%%% "+n));
	

        
   }

}