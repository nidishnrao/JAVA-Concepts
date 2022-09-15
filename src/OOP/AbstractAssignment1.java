package OOP;


// CREATING ABSTRACT CLASS
abstract class abst{
	
	abstract void m1();
	void m2() {
		System.out.println("This is non abstract class method");
	}
}
public class AbstractAssignment1 extends abst {

	public static void main(String[] args) {
		AbstractAssignment1 obj = new AbstractAssignment1();
		obj.m3();
		
	}
	void m3() {
		System.out.println("This is Sub class method");
	}
	void m1() {
		System.out.println("This is Sub class method extended by abs");
	}

}
