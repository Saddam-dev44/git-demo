package MobileProgram;

public class Patten5 {

	public static void main(String[] args) {
		int size=10;
		int i,j,k;
		for(i=size;i>0;i--) {
			for(j=i;j<size;j++) {
				System.out.print(" ");
			}
		//	for(k=0;k<(2*i+1);k++) {
		//		System.out.print("0");
				for(k=(2*i+0);k>0;k--) {
					System.out.print("0");
			}
		
		System.out.println();
		}
	}

}
