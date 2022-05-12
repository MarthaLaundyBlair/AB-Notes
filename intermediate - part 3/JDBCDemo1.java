import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.DriverManager;
class JDBCDemo1{
   
   public static void main(String[] args){
	
	
	try{
	   
	   Class.forName("com.mysql.jdbc.Driver");	
	   Connection dbCon = DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
	   Statement st = dbCon.createStatement();
	   String query = "CREATE table course(course_id int,course_title varchar(20))";
	   //st.execute(query);
	   
	   //System.out.println("Table created!!");
  
	}
	catch(ClassNotFoundException e){
	
	   System.out.println(e);
	}
	catch(SQLException e){
	
		System.out.println(e);
	}
	
   
   }

}