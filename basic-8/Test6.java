class A{
  A(){
	System.out.println("A");
  }
}
class B extends A{
  B(int x){
	System.out.println("B");
  }
}
class C extends B{
  C(){
	super(100);
	System.out.println("C");
  }
}

class Test6{

   public static void main(String[] args){
     new C(); // This line will call class C constructor 
   }
}