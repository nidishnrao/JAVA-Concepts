package BasicsOfJAVA;
import java.util.Arrays;

public class AscendingString {

	public static void main(String[] args) {
		String name="nidish";
	    char temp[] = name.toCharArray();
	     Arrays.sort(temp);
	     String outputString = new String(temp);
	     
	     System.out.println("Sorted String is "+ outputString);
	     

	}

}
