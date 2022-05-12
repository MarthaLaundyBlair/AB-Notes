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

}

class Cat extends Pet{
	
  public void sound(){
	System.out.println("Meow");
  }

}

class AbstractDemo1{
	
	public static void main(String[] args){
	   
	   // Pet p1 = new Pet();
	   
	   
	   Dog d1 = new Dog();
	   
	   Cat c1 = new Cat();
	   
	   d1.sound();
	   
	   c1.sound();
		
	}	
}

