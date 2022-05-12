public class InheritanceDemo1 { 

	public static void main(String[] args){
	
	   Person p1 = new Person(1,"Kishore");
	   
	   
	   Student s1 = new Student(2,"Mike","m@gmail.com","Java");
	   
	   
       System.out.println(p1.getId());

	   System.out.println(p1.getName());
	    
	   System.out.println(s1.getStudentData());
	   
	}

}