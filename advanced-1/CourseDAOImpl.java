import java.sql.*;
import java.util.*;
public class CourseDAOImpl implements CourseDAO{

    private Connection con;
	
	private PreparedStatement pst;
	
	private ResultSet rs;

    public CourseDAOImpl(){
		
		try{
          
          Class.forName("com.mysql.cj.jdbc.Driver");

          this.con = DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
			
		  System.out.println("connection established");
		}
		catch(ClassNotFoundException e){
			
			System.out.println(e);
		}
		catch(SQLException e){
			System.out.println(e);
		}
		
	}


    public int addCourse(Course course){
	   
	   // Create a PrepareStatement using connection object
	   
	   try{
	   
	   this.pst = this.con.prepareStatement("INSERT into course(course_id, course_title) VALUES(?,?)");
	   
	   
	   // Replace ?s with actual course details 
	   // Here 1 indicates first question mark 2 indicates second
	   this.pst.setInt(1, course.getCourseId());
	   this.pst.setString(2, course.getCourseTitle());
	   
	   // executeUpdate method is used to execute INSERT, UPDATE and DELETE queries
       // executeUpdate method always return an int value 
	   // int value represents the number of rows inserted/updated/deleted
	   int i = this.pst.executeUpdate();

	   return i;
	   }
	   catch(SQLException e){
		 return -1;
	   }
	}
  
    public List<Course> findAllCourses(){
	   
	   
	   List<Course> courses = new ArrayList<>();
	   
	   try{
	   this.pst = this.con.prepareStatement("SELECT * from course");
	   
	   // executeQuery method is always used to execute SELECT command
	   // executeQuery always returns a ResultSet object
	   this.rs = this.pst.executeQuery();
	   
	   while(this.rs.next()){
		  //converts each row referred by ResultSet into a Course object and add it a List
		 courses.add(new Course(this.rs.getInt("course_id"),this.rs.getString("course_title"))); 
		   
	   }
	   
	   //return this.rs;
	   return courses;
	   
	   }
	   catch(SQLException e){
		 return null;
	   }
	}
  
	public Course findNamedCourse(String courseTitle){
	   
	   try{
	   this.pst = this.con.prepareStatement("SELECT * FROM course WHERE course_title = ?");
	    this.pst.setString(1, courseTitle);
	   
	   // executeQuery method is always used to execute SELECT command
	   // executeQuery always returns a ResultSet object
	   this.rs = this.pst.executeQuery();
	   
	  
		course = new Course(this.rs.getInt("course_id"),this.rs.getString("course_title")); 

	   return course;
	   
	   }
	   catch(SQLException e){
		 return null;
	   }
	}
    

}