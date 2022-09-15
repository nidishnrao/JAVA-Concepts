package BasicsOfJAVA;
//without parameter &  return type

public class Function1 {

	public static void main(String[] args) {
		// FUNCTION CALLING 
		// FUNC IS CALLED BY 
		//OBJECTNAME.FUNCTIONNAME ---> classname func= new classname func
		Function1 obj = new Function1();
		obj.add();
		obj.add();
	}
	
	//FUNCTION DEFINITION
		void add() { //Void is used as its no returning any value
			int x = 10;
			int y = 20;
			int sum = x+y;
			System.out.println("Sum of 2 numbers using function is "+ sum);
		}
}
