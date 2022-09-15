package OOP;
class login{
	void login_details(){
		System.out.println("******************************");
		System.out.println(" WELCOME TO LOGIN PAGE");
		System.out.println(" ");
		System.out.println("Username : Nidish Rao");
		System.out.println("Account Number :  XXXXXX9078");
		System.out.println("Bank Branch name :  ICIC Bank");
		System.out.println("******************************");
	}
	
}

//InheritanceSingleAssignment1 class is a add beneficiary class
public class InheritanceSingleAssignment1 extends login {

	public static void main(String[] args) {
		InheritanceSingleAssignment1 bank = new InheritanceSingleAssignment1();
		bank.login_details();
		bank.add_ben();

	}
	void add_ben(){
		System.out.println("ADD BENEFICIARY");
		System.out.println(" ");
		System.out.println("Username : Ram Singh");
		System.out.println("Account Number :  98345729098");
		System.out.println("Bank Branch name :  HDFC Bank");
		System.out.println("******************************");
	}

}
