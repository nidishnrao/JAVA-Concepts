package BasicsOfJAVA;
import java.util.*; 
public class AscendingArray {

	public static void main(String[] args) {
		
		int x[]= {91,21,81,57,90};
		//using sorting logic
//
//		for(int i=0; i<5; i++)   
//		{  
//		for(int j=i+1; j<5; j++)   
//		{  
//		int tmp = 0;  
//		if (x[i] > x[j])   
//		{  
//		tmp = x[i];  
//		x[i] = x[j];  
//		x[j] = tmp;  
//		}  /
//		}  
//		}
//		
//		for(int k=0;k<5;k++) {
//		System.out.println(x[k]);
//		}
//	
//		
		
		//using sort function
		Arrays.sort(x);

		for(int k=0;k<5;k++) {
	System.out.println(x[k]);
		}
	
		}

	}


