import java.util.ArrayList;
import java.util.Iterator;
class ArrayListDemo{
  
  public static void main(String[] args){
    
    ArrayList list = new ArrayList(); // Valid prior to Java 5	
	
	list.add(100); // Auto-Boxing - Process of converting a primitive into an object
	list.add("Abc");
	list.add(10.5);
	list.add(new Integer(1000)); // Prior to Java 5
	list.add(new String("Xyz")); // Prior to Java 5
	
	// "Object" is the super class for all Java classes
	for(Object value : list){
		System.out.println(value);
	}
	
	
	Iterator it = list.iterator();
	
	
	while(it.hasNext()){
		
		int a  = (int) it.next(); // Explicit type-casting/Downward casting
		
		System.out.println(a);
		
	}
	
	
  
  }
  

}