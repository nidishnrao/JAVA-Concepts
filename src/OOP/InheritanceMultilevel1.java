package OOP;

class grandparent{
	void m1() {
		System.out.println("I am grandfather class called by father");
	}
}



class parent extends grandparent{
	void m2() {
		System.out.println("I am father class called by my son");
	}
}


public class InheritanceMultilevel1 extends parent{

		public static void main(String[] args) {
			
			InheritanceMultilevel1 son = new InheritanceMultilevel1();
			son.m1();
			son.m2();
			son.m3();
			}
		void m3() {
			System.out.println("I am child class");
		}

}
