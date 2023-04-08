package MobileProgram;

public class Pattren2 {

	public static void main(String[] args) {
		int i,j,k,line=4;
		for(i=0;i<=line;i++) {
			for(j=0;j<=line;j++) {
				if(i==j)
					System.out.print("* ");
				else
					System.out.print(" ");
				
			}
		
			System.out.print("# ");
			while(j>=0) { 
				if(i==j)
				System.out.print("* ");
			else
				System.out.print(" ");
			
			j--;
			}
			System.out.println("");
		}
		}
	


}
