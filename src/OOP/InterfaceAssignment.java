package OOP;

interface interassign{
	void m1();
}


public class InterfaceAssignment implements interassign{

	public static void main(String[] args) {
		InterfaceAssignment obj =new InterfaceAssignment();
		obj.m2();		
	}
	public void m2() {
		System.out.println("M2 code is defined in subclass");
	}


}
