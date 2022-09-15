package OOP;

public class Static2ExampleEmployee {


		String emp_name;
		int emp_id;
		String emp_sal;
		String emp_desg;
		static String emp_company;
		
		public static void main(String[] args) {
			Static2ExampleEmployee emp = new Static2ExampleEmployee();
			emp.init("Bruce",101,"10 Lpa","Developer");
			thisistaticfun();		// DECLARATION OF STATIC FUNCTION DIRECTLY
			emp.display();
			System.out.println("");
			emp.init("Tony", 102,"15Lpa","Team lead");
			emp.display();
			System.out.println("");
			emp.init("Nick",103,"5lpa", "Tester");
			emp.display();

		}
		void init(String emp_name,int emp_id, String emp_sal, String emp_desg) {//	USING "THIS" TO ACCESS
			this.emp_name=emp_name;
			this.emp_id=emp_id;
			this.emp_sal=emp_sal;
			this.emp_desg=emp_desg;
		}
		void display(){
			System.out.println("Employee name is "+ emp_name);
			System.out.println("Employee ID is "+ emp_id);
			System.out.println("Employee Salary is "+ emp_sal);
			System.out.println("Employee Designation is "+ emp_desg);
			System.out.println("Employee Company name is "+ emp_company);
		}
		static void thisistaticfun() {//USING STATIC FUNCTION
			emp_company="OSCORPS";
		}
		static {
			System.out.println("THIS STATIC BLOCK IS EXECUTED BEFORE MAIN BLOCK"); //static function will be executed first before main func
		}

	}

