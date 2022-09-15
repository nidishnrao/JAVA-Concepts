package OOP;

public class MainMethodOverloading {

	public static void main(String[] args) {
		System.out.println("This is default : Main1");
		MainMethodOverloading m = new MainMethodOverloading();
		m.main();
		m.main(5);	
		}
	void main() {
		System.out.println("This is Main2");
	}
	void main(int a) {
		System.out.println("This is Main3");
	}
	
}
