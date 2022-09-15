package BasicsOfJAVA;

public class MultidimensionalArray {

	public static void main(String[] args){

		int x[][]  =new int[2][4];
		
		//initialization of array
		x[0][0]=11;
		x[0][1]=21;
		x[0][2]=78;
		x[0][3]=56;
		x[1][0]=90;
		x[1][1]=72;
		x[1][2]=45;
		x[1][3]=34;
		
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(x[i][j]);
				if (j<3){
					System.out.print(",");
				}
				
			}
			System.out.println(" ");
		}
		
	}
	

}
