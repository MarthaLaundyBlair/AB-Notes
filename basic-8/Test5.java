class A{
  A(){
	//super(); // Calls constructor of class Object
  	System.out.println("A");
  }
}
class B extends A{
  B(){
	//super(); // Calls constructor of class A   
  	System.out.println("B");
  }
}
class C extends B{
  C(){
	//super(); // Calls constructor of class B 
  	System.out.println("C");
  }
}

class Test5{

   public static void main(String[] args){
     new C(); // This line will call class C constructor 
   }
}

