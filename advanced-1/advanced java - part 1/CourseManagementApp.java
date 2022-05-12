public class CourseManagementApp{
	
	public static void main(String[] args){
	
	   // This makes your code polymorphic
	   
	   CourseDAO courseDAO = new CourseDAOImpl();
	   
	   CourseController ctrl = new CourseController(courseDAO);
	   
	   CourseView cv = new CourseView(ctrl);
	   
	   cv.loadMenu();
	
	}

}