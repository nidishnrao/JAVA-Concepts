package OOP;

class Animal
{
	void animals() {
		System.out.println("Talk about animals");
	}
}

public class MethodOverRiding1 extends Animal {

	public static void main(String[] args) {

		MethodOverRiding1 animal = new MethodOverRiding1();
		animal.animals();
	
	}
	
	//before talking about dogs user wants to speak about animals and then dog
	void animals() {
		super.animals(); // as super will execute the parent class method first
		System.out.println("Dogs are loyal animals");
	}

}
