abstract class Pet{

  // Abstract method contains no body/implementation {}
  public abstract void sound();
  
  // Concrete method
  public void greetings(){
	  
	  
  }

}

class Dog extends Pet{
  // Method overriding
  /*
    If a method exists in super class and subclass with same name and signature/params
  */
  public void sound(){
	System.out.println("Woof");
  }
  
  // Direct method 
  public void heyDog(){
	System.out.println("Hi");
  }

}

class Cat extends Pet{
	
  public void sound(){
	System.out.println("Meow");
  }

}

class PolymorphismDemo{
	
	public static void main(String[] args){
	   
	   /*
	   
	    Poly - Many 
		
		Morphism - Forms/Behaviours
		
		Examples:
		
		+ operator is an example of compile time polymorphism
		
		+ can be used to perform arithmetic operation 
		
		  And it can also be used to concat to Strings or int and String
		
	     
		Method Overriding leads to Polymorphism
	   
	   */
	   
	   
	   /*Dog d1 = new Dog();
	   
	   Cat c1 = new Cat();*/
	   
	   //NOTE: A super class reference can refer to all of its subclass objects
	   
	   // Can a super class reference access/call the direct methods of its subclass?
	   Pet p1 = new Dog();
	   
	   p1.sound();
	   
	  // p1.heyDog(); // Error
	   
	   Dog d1 = (Dog) p1;
	   
	   d1.heyDog(); // Works fine now
	   
	   p1 = new Cat();
	   
	   p1.sound();
		
	}	
}

