package OOP;

public class MethodOverloading {
	//ADDITION
	void add(int x,int y) { 
		int sum = x+y;
		System.out.println("Sum of 2 int numbers using function is "+ sum);
		}
	
	void add(float x,float y) { 
		float sum = x+y;
		System.out.println("Sum of 2 float numbers using function is "+ sum);
		}
	void add(int x,int y,int z) { 
		int sum = x+y+z;
		System.out.println("Sum of 3 int numbers using function is "+ sum);
		}

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.add(50,90);
		obj.add(30.5f,45.6f);
		obj.add(50,90,10);

	}



}
