package MobileProgram;

public class Pattren1 {

	public static void main(String[] args) {
		int line=5,i,j;
		for(i=1;i<=line;i++) {
			for(j=line;j>=1;j--) {
				if(j!=i)
					System.out.print( j+" ");
				else
				System.out.print( "X ");

			}
			System.out.println();
		}
	}

}
