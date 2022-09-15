package OOP;

class father{
	void m1() {
		System.out.println("I am father class called by my son");
	}
}

//Single Inheritance
public class InheritanceSingle1 extends father{

	public static void main(String[] args) {
		
		InheritanceSingle1 son = new InheritanceSingle1();
		son.m2();
		son.m1();
		}
	void m2() {
		System.out.println("I am child class");
	}

}
