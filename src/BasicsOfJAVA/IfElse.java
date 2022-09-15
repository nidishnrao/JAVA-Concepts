//If else else if statements using student marks example

package BasicsOfJAVA;

public class IfElse
{
	public static void main(String[] args) {
		int marks=60;
      if (marks>=90) //for one line of conditions { is not required
	System.out.println("First Class");
	else if (marks>=60 && marks<90)
	System.out.println("Second Class");
      else if (marks>=35 && marks<60)
      System.out.println("Pass");
      else
      System.out.println("Fail");
	}
}

