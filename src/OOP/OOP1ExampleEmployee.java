package OOP;

public class OOP1ExampleEmployee {
	String ename;
	int eid;
	String esal;
	String edesg;
	

	public static void main(String[] args) {
		OOP1ExampleEmployee emp= new OOP1ExampleEmployee();
		emp.init("Bruce",101,"10 Lpa","Developer");
		emp.display();
		System.out.println("");
		emp.init("Tony", 102,"15Lpa","Team lead");
		emp.display();
		System.out.println("");
		emp.init("Nick",103,"5lpa", "Tester");
		emp.display();

	}
	void init(String ename_temp,int eid_temp,String esal_temp,String edesg_temp) {
		ename=ename_temp;
		eid=eid_temp;
		esal=esal_temp;
		edesg=edesg_temp;
	}
	void display(){
		System.out.println("Employee name is "+ ename);
		System.out.println("Employee ID is "+ eid);
		System.out.println("Employee Salary is "+ esal);
		System.out.println("Employee Designation is "+ edesg);
		
	}

}
