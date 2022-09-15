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

class Add_Beneficiary extends login{
	void add_ben(){
		System.out.println("ADD BENEFICIARY");
		System.out.println(" ");
		System.out.println("Username : Ram Singh");
		System.out.println("Account Number :  98345729098");
		System.out.println("Bank Branch name :  HDFC Bank");
		System.out.println("******************************");
	}
}


//InheritanceMultilevelAssignment2 class is a transfer funds class
public class InheritanceMultilevelAssignment2 extends Add_Beneficiary{

	public static void main(String[] args) {
		
		InheritanceMultilevelAssignment2 bank = new InheritanceMultilevelAssignment2 ();
		bank.login_details();
		bank.add_ben();
		bank.Trans_fund();
		
		
	}
	void Trans_fund(){
		System.out.println("TRANSFER FUNDS");
		System.out.println(" ");
		System.out.println("Choose fund transfer");
		System.out.println("1.RTGS");
		System.out.println("2.NEFT");
		System.out.println("3.IMPS");
		System.out.println(" ");
		System.out.println("Enter Amount to transfer = 3,00,000 Rs");
		System.out.println(" ");
		System.out.println(" Fund Transfer Successfully!!! ");
		System.out.println("******************************");
	}

}
