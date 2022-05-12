class Person{

  private int id;

  private String name;
  
  //Default Constructor - A constructor which takes ZERO parameters 
  // No-parameterized constructor
  
  public Person(){
    // To initialize the instance variables with some custom values
	
    this.id = 1;
	
	this.name = "Tom";
  }

  // Parameterized constructor
  
  public Person(int id,String name){
  
    this.id = id;
	
	this.name = name;
  }
  
  
   public Person(String name){
  
    this.name = name;
   }
   
   
   public int getId(){
   
     return this.id;
   
   }
   
   
   public String getName(){
      
	 return this.name;
   
   }
   
   /*
   
   public void setId(int id){
     this.id = id;
	 
   }
      
	
   public void setName(String name){
	 this.name = name;
   }   
   
   public void setPersonDetails(int id,String name){
	  this.id = id;
	  this.name = name;
   }
   	  
   
   */
   
   
  

}



class ConstructorOverloading{

  public static void main(String[] args){

   Person p1 = new Person(); // this statement will call a constructor from Person class which takes no arguments
	
  
   Person p2 = new Person(2, "Alex"); // Calls a parameterized constructor	
  
  
   Person p3 = new Person("Mike");
   
   
   //System.out.println("Person ID :"+p1.id); Error 
   
   
   System.out.println("Person ID :"+p1.getId()+" Name  "+p1.getName());
   System.out.println("Person ID :"+p2.getId()+" Name  "+p2.getName());
   System.out.println("Person ID :"+p3.getId()+" Name  "+p3.getName());
   
  
  }  

}