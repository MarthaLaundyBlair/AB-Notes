import java.util.*;
public class CourseView{
	
  
  // Has-a relationship
  private CourseController controller;	
  
  // Dependency Injection using constructor
  // This approach makes classes loosely coupled
  public CourseView(CourseController controller){

	this.controller = controller;

  }	 

  public void loadMenu(){
	  
	int choice;
	
	Scanner sc = new Scanner(System.in);
	
	int courseId = 0;
	String courseTitle = null;

    do{
	  System.out.println("******* MENU ******");
	  System.out.println("1. ADD Course");
	  System.out.println("2. View Courses");
	  System.out.println("3. Find Course By Title");
	  System.out.println("4. Update Course Title By Id");
	  System.out.println("5. Delete Course By Id");
	  System.out.println("6. EXIT");
	  System.out.println("Enter your choice");
	  choice = sc.nextInt();
	  
	  sc.nextLine();
	  
	  switch(choice){
		
		case 1: 
		
			  System.out.println("Enter Course ID ");
			  courseId = sc.nextInt();
			  
			  sc.nextLine();
			  
			  System.out.println("Enter Course Title ");
			  courseTitle = sc.nextLine();
			  
			  Course c = new Course(courseId,courseTitle);
			  
			  addCourseData(c);
			  
			  break;
		
		case 2:
		
		     loadAndDisplayCourses();
			 break;
			 
		case 3:
			System.out.println("Enter Course Title ");
			courseTitle = sc.nextLine();
			  
			displayCourseByTitle(courseTitle);
			
			
		case 6:
		    System.exit(0);
		     
			  
	 }
	  
	  
	  

	}
    while(choice!=6);	


  }	  
  
	
  // UI Logic
   
  public void addCourseData(Course c){
	  
	int result  = this.controller.addCourse(c);	
	
	System.out.println(result+" course added");
  }

  public void loadAndDisplayCourses(){
	  
	
		 List<Course> courseList = this.controller.getAllCourses();
		 
		 courseList.forEach(course -> System.out.println(course));
	
  }
  
  public void displayCourseByTitle(String courseTitle){
	  
		System.out.println("testing");
		 //List<Course> courseList = this.controller.getAllCourses();
		 Course course = this.getNamedCourse(courseTitle);
		 System.out.println(course);
  }
}
