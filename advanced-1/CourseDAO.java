import java.util.*;
// Data Access Object - One of the design patterns
public interface CourseDAO{

  public int addCourse(Course course);
  
  public List<Course> findAllCourses();
  
  
  
}