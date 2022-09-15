package BasicsOfJAVA;

public class FunctionAssignmentCalculator {

	public static void main(String[] args) {
		FunctionAssignmentCalculator obj = new FunctionAssignmentCalculator();
		int a=3;
		int b=7;
		int addition = obj.add(a, b);
		System.out.println("Addition of "+a+" & "+b+ " is "+ addition);
		int c=10;
		int d=5;
		int difference = obj.sub(c, d);
		System.out.println("Difference of "+c+" & "+d+ " is "+ difference);
		obj.mul(6,5);
		obj.div(10,2);

	}
	int add(int x, int y) { //Returns sum
		int sum=x+y;
		return(sum);
	}
	
	int sub(int x, int y) { //Returns sub
		int sub=x-y;
		return(sub);
	}
	
	void mul(int x, int y) { //Does not return mul
		int mul=x*y;
		System.out.println("Multiplication of "+x+" & "+y+ " is "+ mul);
	}
	
	void div(int x, int y) { //Does not return div
		int div=x/y;
		System.out.println("Division of "+x+" & "+y+ " is "+ div);
	}
}
