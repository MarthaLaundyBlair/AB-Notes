public class CourseView{
	
  
  // Has-a relationship
  private CourseController controller;	
  
  
  private Course course;
  
  /*
  public CourseView(){
	 // This line make the code strongly-coupled
	this.controller = new CourseController();
  }
  */

  // Dependency Injection using constructor
  // This approach makes classes loosely coupled
  public CourseView(CourseController controller, Course course){

	this.controller = controller;
	this.course = course;

  }	  
  
	
  // UI Logic
   
  public void addCourseData(){
	  
	int result  = this.controller.addCourse(this.course);	
	
	System.out.println(result);
  }
  
}
