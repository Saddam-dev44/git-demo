package MobileProgram;

public class LowerTringlurMatrix {

	public static void main(String[] args) {
		int col,row;
		int a[][]= {
					{1,2,3},
					{8,6,4},
					{4,5,6}
	};
		 row=a.length;
		 col=a.length;
		 if(row!=col) {
			 System.out.println("matrix must be square matrix:");
			 }
		 for(int i=0;i<row;i++) {
			 for(int j=0;j<col;j++) {
				 if(i<j) 
				 System.out.print("x ");
				 else
					 System.out.print(a[i][j]+" ");
				 }
			 System.out.println();
			 }
		 }
		 
				
		}
	


