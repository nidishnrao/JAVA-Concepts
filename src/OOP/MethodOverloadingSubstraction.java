package OOP;

public class MethodOverloadingSubstraction {

		//SUBSTRACTION
		void sub(int x,int y) { 
			int diff = x-y;
			System.out.println("Difference of 2 int numbers using function is "+ diff);
			}
		
		void sub(float x,float y) { 
			float diff = x-y;
			System.out.println("Difference of 2 float numbers using function is "+ diff);
			}
		void sub(int x,int y,int z) { 
			int diff = x-y-z;
			System.out.println("Difference of 3 int numbers using function is "+ diff);
			}

		public static void main(String[] args) {
			MethodOverloadingSubstraction obj = new MethodOverloadingSubstraction();
			obj.sub(90,50);
			obj.sub(45.5f,30.6f);
			obj.sub(100,30,20);


	}

}
