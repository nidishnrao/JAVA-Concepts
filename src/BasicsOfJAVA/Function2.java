package BasicsOfJAVA;
//with parameter but without  return type

public class Function2 {

	public static void main(String[] args) {
		Function2 obj = new Function2();
		obj.add(50,90);
		obj.add(50,50);

	}
	
	//FUNCTION DEFINITION
		void add(int x,int y) { //Void is used as its no returning any value
			int sum = x+y;
			System.out.println("Sum of 2 numbers using function is "+ sum);
		}
}
