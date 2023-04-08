package MobileProgram;

public class Ptteren3 {

	public static void main(String[] args) {
		int i,j,line=4;
		for(i=0;i<=line;i++) {
			for(j=0;j<=line;j++) {
				if(i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
		for(int k=0;k<2;k++) {
			System.err.print(" #");}
			while(j>=0) { 
				if(i==j)
				System.out.print("*");
			else
				System.out.print(" ");
			j--;
			}
			System.out.println(" ");
		
		}
	}
	

	}
