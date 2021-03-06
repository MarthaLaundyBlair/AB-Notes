import java.util.*;
public class CourseController{
	
  // Has-a relationship	
  //private CourseDAOImpl courseDAOImpl;
  // This makes your code polymorphic
  private CourseDAO courseDAO;
  
  // Dependency Injection - make the code loosely coupled
  public CourseController(CourseDAO courseDAO){
	  
	this.courseDAO = courseDAO; 
  }
	
  // Methods to communicate da
   
  public int addCourse(Course c){
    //int i = this.courseDAOImpl.addCourse(c);
	//return i;
	return this.courseDAO.addCourse(c);
  }	 


  public List<Course> getAllCourses(){
	  
	  
	/*List<Course> courseList = this.courseDAOImpl.findAllCourses();  
   
    return courseList;*/
	
	return this.courseDAO.findAllCourses();

  }	  
  
  public Course getNamedCourse(String courseTitle){
	  
	  return this.courseDAO.findNamedCourse(courseTitle);
  }

}