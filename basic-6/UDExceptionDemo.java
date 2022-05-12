class EmailException extends Exception{

  private String message;
  
  
  public EmailException(String message){
    
	this.message = message;
  
  }
  
  @Override
  public String toString(){
  
    return this.message;
  
  }
  
}


class UDExceptionDemo{
	
	public static void main(String[] args){
		
	  String email = args[0];
	  
	  
	  if(email.indexOf('@') != -1){
		  
		 System.out.println("Valid Email");
	  }
	  else{
		  
		try{ 
			//throw new EmailException("Invalid Email ID, please input a correct email");
		
			EmailException ex = new EmailException("Invalid Email ID, please input a correct email");	
			throw ex;
			
		}
		catch(EmailException e){
		  
		  System.out.println(e);
		}
	  
	  }
	
	}

}