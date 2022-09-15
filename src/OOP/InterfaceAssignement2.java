package OOP;

interface interassignment2{
	void m1();
}


public class InterfaceAssignement2 implements interassignment2{

	public static void main(String[] args) {
		InterfaceAssignement2 obj =new InterfaceAssignement2();
		obj.m2();
		obj.m1();		
		
	}
	public void m1() {
		System.out.println("This method m1 is defined in subclass implemented from interface");
	}

	public void m2() {
		System.out.println("This method m2 is defined in subclass");
	}


}
