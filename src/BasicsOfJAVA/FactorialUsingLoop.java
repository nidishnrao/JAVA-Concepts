package BasicsOfJAVA;

public class FactorialUsingLoop {

	public static void main(String[] args) {
		int num = 4;
		int n=num;
		int fact=1;
		while(n>=1) {
			fact=fact*n;
			n--;
		}
		System.out.println("Factorial of a number "+num+" is "+ fact);


	}

}
