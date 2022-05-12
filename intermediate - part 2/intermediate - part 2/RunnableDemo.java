class NewTarget implements Runnable{ // This just created thread target

   @Override
   public void run(){
	
	 System.out.println("New Target is running.......");
   }
	
}

class RunnableDemo{

   public static void main(String[] args){
   
	 NewTarget target1 = new NewTarget();
	 
	 //target1.start(); // Error - start() is not defined in Runnable interface
   
     Thread t1 = new Thread(target1); // This will attach a target to Thread
	 
   
     t1.start();
	 
	 Thread t2 = new Thread(target1); // This will attach a target to Thread
	 
	 t2.start();
   }
  
}


