package BasicsOfJAVA;

public class RecursionExample {

	public static void main(String[] args) {
		RecursionExample obj = new RecursionExample();
		int n =5;
		int factorial= obj.fact(n);	
		System.out.println("Factorial of a number "+ n+" using recursion is "+ factorial);

	}
	
		int fact(int x){ 
			if (x>=1) {
				return (x*fact(x-1));
			}
			else {
				return 1;
			}
		}
}
