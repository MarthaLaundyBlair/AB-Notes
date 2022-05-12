// this class is responsible for creating only object
class MyFactory{
	
  /*

    Factory classes generally have static methods 	
	that create and return objects
	
	
  */
  
  
  public static Customer getCustomer(){
  
	  return new Customer(1, "Kishore");
  
  }
  


}