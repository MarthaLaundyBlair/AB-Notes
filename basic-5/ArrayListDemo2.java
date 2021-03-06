import java.util.ArrayList;
import java.util.Iterator;
class ArrayListDemo2{
  
  public static void main(String[] args){
    
	// The below declaration uses Generics <Type> 
	// Generics - Provide Type safety and avoid explicit type-casting
    //ArrayList<Integer> list = new ArrayList<Integer>(); // Prior to Java 7
    // <> is known as type-inference diamond - it was introduced in Java 7	
	ArrayList<Integer> list = new ArrayList<>(); // Since Java 7	
	
	list.add(100); 
	list.add(200);
	list.add(300);
	
	
	
	for(int value : list){
		System.out.println(value);
	}
	
	
	Iterator<Integer> it = list.iterator();
	
	
	while(it.hasNext()){
		
		//int a  = (int) it.next(); // Explicit type-casting/Downward casting
		int a  = it.next(); 
		System.out.println(a);
		
	}
	
	
  
  }
  

}