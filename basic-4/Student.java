public class Student extends Person{ // Student is a Person

  private String email;
  private String course;
  
  
  // Write a constructor which takes all parameters 
  public Student(int id,String name,String email, String course){
    // this will call a super class constructor which takes params
    super(id,name);   
	this.email = email;
	this.course = course;
  
  }
  
  public String getStudentData(){
	
    return super.getId()+"  "+super.getName()+"  "+this.email+"   "+this.course;	
	  
  }
  
  
}