class BankAccount implements Runnable{
	
	private double balance = 1000;
	
	
	private double withdraw;
	
	
	public BankAccount(double withdraw){
		
	  this.withdraw = withdraw;
	}
	
	
   @Override
   // Synchronized methods are thread-safe - only one thread can access this method at a time
   public synchronized void run(){
	
	  if(balance >= withdraw){
		
		System.out.println(Thread.currentThread().getName()+" has withdrawn "+withdraw);
		
		//balance -= withdraw;
		
		balance = balance - withdraw;
		
	  }
	  else{
	  
	    System.out.println("Insufficient Funds");
	  
	  }
	  
   }
	

}


class RaceConditionDemo{
	
	public static void main(String[] args){
	
	  BankAccount acct = new BankAccount(1000); // this will set a withdrawal amount
	  
	  
	  Thread t1 = new Thread(acct);
	  
	  Thread t2 = new Thread(acct);
	  
	  
	  t1.setName("First Person");
	  
	  t2.setName("Second Person");
	  
	  
	  t1.setPriority(9);
	  
	  t2.setPriority(7);
	  
	  
	  t1.start();
	  
	  t2.start();
	  
	  
	  
	  
	  
   
    }

}
