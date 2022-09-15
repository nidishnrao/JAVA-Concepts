package OOP;

// CREATING A SUBCLASS AND IMPLEMENT ABSTRACT CLASS 
abstract class absassign{
	
	abstract void m1();
	void m2() {
		System.out.println("This is non abstract class method");
	}
}

public class AbstractAssignment2 extends absassign {

		public static void main(String[] args) {
			AbstractAssignment2 obj = new AbstractAssignment2();
			obj.m3();
			obj.m1();
			obj.m2();
			
		}
		void m3() {
			System.out.println("This is Sub class method");
		}
		void m1() {
			System.out.println("This is Sub class method extended by abstract class");
		}

	}
