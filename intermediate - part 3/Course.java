public class Course{
	
  private int courseId;
  private String courseTitle;
  
  public Course(int courseId, String courseName){
  
	this.courseId = courseId;
	this.courseTitle = courseTitle;
  
  }
	
  @Override
  public String toString(){

    return "Course ID "+this.courseId+" Course Title "+this.courseTitle;
  }  

}