package BasicsOfJAVA;

public class MatrixAddition {

	public static void main(String[] args) {
		
		//using single dimensional array
		int a[] = {1,2,3,4};
		int b[]= {5,6,7,8};
		int c[]= new int [4];
		

		for (int j=0;j<4;j++) {
			System.out.println(c[j]=a[j]+b[j]);
		}
		
		
		
//		
//		//using multi dimensional array
//		int a[][]=new int [2][2];
//		int b[][]=new int [2][2];
//		int c[][]=new int [2][2];
//		
//		
//		a[0][0]=1;
//		a[0][1]=2;
//		a[1][0]=3;
//		a[1][1]=4;
//		
//		b[0][0]=5;
//		b[0][1]=6;
//		b[1][0]=7;
//		b[1][1]=8;
//		
//		for(int i=0;i<2;i++) 
//		{
//			for(int j=0;j<2;j++) 
//			{	
//			c[i][j]=a[i][j]+b[i][j];
//			}
//		}
//		
//		for (int k=0;k<2;k++) 
//		{
//			for (int l=0;l<2;l++) 
//			{
//		System.out.print(c[k][l]);
//		
//		if (l<1){
//			System.out.print(",");
//		}
//		
//			}
//		System.out.println(" ");
//		}
//		
//		

	}

}
