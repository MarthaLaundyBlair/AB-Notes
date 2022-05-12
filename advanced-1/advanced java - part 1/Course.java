public class Course{
	
  private int courseId;
  private String courseTitle;
  
  public Course(int courseId, String courseTitle){
  
	this.courseId = courseId;
	this.courseTitle = courseTitle;
  
  }
  
  public int getCourseId(){
	  
	return this.courseId;  
  }
  
  public String getCourseTitle(){
	  
	return this.courseTitle;
  }
	
  @Override
  public String toString(){

    return "Course ID "+this.courseId+" Course Title "+this.courseTitle;
  }  

}