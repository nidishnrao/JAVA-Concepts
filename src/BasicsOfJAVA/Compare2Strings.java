package BasicsOfJAVA;

public class Compare2Strings {

	public static void main(String[] args) {
		

		String name1="Nidish";
		String name2="Nidish";
		int len1 = name1.length();
		int len2 = name2.length();
		boolean flag = false;
		
		if (len1==len2) {
			for(int i=0;i<len1;i++) {
				if (name1.charAt(i)!=name2.charAt(i)) {
					flag=false;
					break;
				}
					
				else {
					flag=true;
				}
		
				
			}	
		}
		if (flag==true) {
			System.out.println("Strings are equal");
		}
		
		else {
			System.out.println("Strings are not equal");
		}
		

		

	}

}
