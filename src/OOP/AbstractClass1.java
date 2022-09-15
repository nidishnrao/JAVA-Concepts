package OOP;

abstract class Abc{
	
	abstract void m1();
	void m2() {
		System.out.println("non abstract class");
	}
}

public class AbstractClass1 extends Abc{

	public static void main(String[] args) {
		AbstractClass1 abs = new AbstractClass1();
		abs.m1(); //cannot create object for m2 without providing definition in subclass
		abs.m2();
		abs.m3();
	}
	void m3() {
		System.out.println("method of sub-class");
	}
	void m1() {
		System.out.println("Overriding abstract to non-abstract class");
	}



}
