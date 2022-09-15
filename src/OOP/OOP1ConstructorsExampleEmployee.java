package OOP;

public class OOP1ConstructorsExampleEmployee {
	String ename;
	int eid;
	String esal;
	String edesg;
	
	public static void main(String[] args) {
		OOP1ConstructorsExampleEmployee emp1 =new OOP1ConstructorsExampleEmployee("Nidish",101,"20Lpa","Developer");
		emp1.display();
		System.out.println("");
		OOP1ConstructorsExampleEmployee emp2 =new OOP1ConstructorsExampleEmployee("Howard",102,"10Lpa","Tester");
		emp2.display();

	}

	OOP1ConstructorsExampleEmployee(String ename_temp,int eid_temp,String esal_temp,String edesg_temp) {
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
