package BasicsOfJAVA;

public class ReverseString {

	public static void main(String[] args) {
		String name="Nidish";
		int len = name.length();
		String reverse=""; 
		System.out.println("Name : "+name);
	
		for(int i=len-1;i>=0;i--) {
			char c= name.charAt(i);
			reverse=reverse+c;
			
		}
		System.out.println("Reversed Name : "+reverse);

	}

}
