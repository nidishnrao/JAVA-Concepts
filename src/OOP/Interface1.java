package OOP;

interface interfaceclass{
	
	void m1(); // need not mention abstract keyword before method
}
public class Interface1 implements interfaceclass{ //class implements the interface

	public static void main(String[] args) {
		Interface1 obj = new Interface1();
		obj.m1();
	}
	public void m1() {
		System.out.println("M1 code is defined in subclass");
	}

}
