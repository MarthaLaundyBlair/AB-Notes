class Student{
	
   private int id;

   private String name;

   public Student(int id, String name){

    // set parameter values into instance variables  
	// "this" is a reference variable which always refers to current working object
	this.id = id;
	this.name = name;

   }  
   
   public void setId(int id){
	   
	   this.id  = id;
   }
   
   public void setName(String name){
	   
	   this.name = name;
   }
   
   
   public int getId(){
	   
	   return this.id;
   }
   
   public String getName(){
	   
	   return this.name;
   }


	


   public String getStudentDetails(){

	 return "Student ID :"+this.id+" Student Name : "+this.name;
   }   
	
}

class EncapsulationDemo{

	
   public static void main(String[] args){
	   
		
	Student s1 = new Student(1, "Kishore");	
	System.out.println(s1.getStudentDetails());
	
	Student s2 = new Student(2, "Mike");	
	System.out.println(s2.getStudentDetails());
	
	
	Student s3 = new Student(3, "Tom");	
	System.out.println(s3.getStudentDetails());
		
	s1.setName("New name");
		
	System.out.println(s1.getStudentDetails());
	
	System.out.println(s2.getStudentDetails());
	
	
   }
	

}


