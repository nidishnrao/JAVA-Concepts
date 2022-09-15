package OOP;

interface inter1{
	void m1();
}

interface inter2 {
	void m2();
}

//MULTIPLE INHERITANCE

public class Interface2MultipleInterfaces implements inter1,inter2{

	public static void main(String[] args) {
		Interface2MultipleInterfaces obj =new Interface2MultipleInterfaces();
		obj.m1();
		obj.m2();
		obj.m3();
		
	}
	void m3() {
		System.out.println("This method M3 is defined in subclass");
	}
	public void m1() {
		System.out.println("This method M1 is defined in subclass implemented from interface 1");
	}

	public void m2() {
		System.out.println("This method M2 is defined in subclass implemented from interface 2");
	}


}
