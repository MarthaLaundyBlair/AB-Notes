class Employee{
	int employeeId;
	String employeeName;
	double salary;
}

class ClassDemo{
	public static void main(String[] args){
		Employee e1 = new Employee();
		e1.employeeId = 1;
		e1.employeeName = "Tom";
		e1.salary = 2000;
		
		////////////////////////////
		
		Employee e2 = new Employee();
		e2.employeeId = 2;
		e2.employeeName = "Alex";
		e2.salary = 2000;
		
		//////////////////////////////
		
		// Employee[] employees = new Employee[2];
		
		//employees[0] = e1;
		//employees[1] = e2;
		
		Employee[] employees = {e1, e2}; //same as
		
		for (Employee e : employees){
		
		System.out.println(e.employeeId);
		System.out.println(e.employeeName);
		System.out.println(e.salary);
		
		}
	}
}