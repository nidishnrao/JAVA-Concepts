package OOP;

class FirstTask{
	
	void routine(){
		System.out.println("Get up at 6 AM");
	}
	
}

public class MethodOverRidingAssignment extends FirstTask {

	public static void main(String[] args) {
		MethodOverRidingAssignment task = new MethodOverRidingAssignment();
		task.routine();

	}
	
	void routine(){
		super.routine();
		System.out.println("Brush your teeth");
	}

}
