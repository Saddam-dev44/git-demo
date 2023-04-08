package MobileProgram;

public class UpperTriangleMatrix {

	public static void main(String[] args) {
		int row,col;
		int a[][]= {
				{1,3,4},
				{1,4,6},
				{1,4,1}	
		};
		row=a.length;
		col=a.length;
		if(row!=col)
			System.out.println("matrix should be in square");
		for(int i =0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i>j)
					System.out.print("z ");
				else
					System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
