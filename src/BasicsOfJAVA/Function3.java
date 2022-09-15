package BasicsOfJAVA;
//with parameter & with return type

public class Function3 {

	public static void main(String[] args) {
		Function3 obj = new Function3();
		int total= obj.add(50,90);	//returned value is stored in total variable of type int	
		System.out.println("Sum of 2 numbers using function is "+ total);

	}
	
	//FUNCTION DEFINITION
		int add(int x,int y) { //int is used as its returning sum value as return type
			int sum = x+y;
			return(sum);
		}
}
