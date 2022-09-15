package BasicsOfJAVA;

public class PrimeNumber {

	public static void main(String[] args) {
		int n = 1;
		boolean flag = true;
		if (n>1){
			for (int i=2; i<((n/2)+1);i++) {
				
				if (n%i==0){
					flag= false;
					break;
					
				}

			}
		}
		else {
			flag= false;
			
		}
		if (!flag) {
			System.out.println("Number is not a prime");
		}
		

		else {
			System.out.println("Number is a prime");
		}

	}

}
