//import java.lang.Thread; // DONT IMPORT THIS PACKAGE PLEASE
class NewThread extends Thread{

   // Override run() method
   
   @Override
   public void run(){
	
	 System.out.println("New thread is running.......");
   
   }

}

class ThreadDemo1{

  public static void main(String[] args){
  
	// Create thread object from NewThread class
	
	NewThread t1 = new NewThread();
	
	// Start the thread 
	
	t1.start();
	
	//t1.run(); // Don't call run() directly

  }

}