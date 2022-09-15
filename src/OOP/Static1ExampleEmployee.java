package OOP;

public class Static1ExampleEmployee {
	String emp_name;
	int emp_id;
	String emp_sal;
	String emp_desg;
	static String emp_company = "Shield";
	
	public static void main(String[] args) {
		Static1ExampleEmployee emp = new Static1ExampleEmployee();
		emp.init("Bruce",101,"10 Lpa","Developer");
		emp.display();
		System.out.println("");
		emp.init("Tony", 102,"15Lpa","Team lead");
		emp.display();
		System.out.println("");
		emp.init("Nick",103,"5lpa", "Tester");
		emp.display();

	}
	void init(String emp_name_temp,int emp_id_temp, String emp_sal_temp, String emp_desg_temp) {
		emp_name=emp_name_temp;
		emp_id=emp_id_temp;
		emp_sal=emp_sal_temp;
		emp_desg=emp_desg_temp;
	}
	void display(){
		System.out.println("Employee name is "+ emp_name);
		System.out.println("Employee ID is "+ emp_id);
		System.out.println("Employee Salary is "+ emp_sal);
		System.out.println("Employee Designation is "+ emp_desg);
		System.out.println("Employee Company name is "+ emp_company);
	}

}
