package OOP;

public class MethodOverloadingMultiplication {
	//MULTIPLICATION
	void mul(int x,int y) {
		int multi= x*y;
		System.out.println("Multiplication of 2 int numbers is "+multi );
	}
	void mul(float x,int y) {
		float multi= x*y;
		System.out.println("Multiplication of 2 int numbers is "+multi );
	}
	void mul(int x,int y, int z) {
		int multi= x*y;
		System.out.println("Multiplication of 2 int numbers is "+multi );
	}

	public static void main(String[] args) {
		
		MethodOverloadingMultiplication obj = new MethodOverloadingMultiplication();
		obj.mul(3,3);
		obj.mul(1.5f,2);
		obj.mul(2,3,4);

	}


}
