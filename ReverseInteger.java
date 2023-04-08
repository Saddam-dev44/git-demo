package MobileProgram;

public class ReverseInteger {

	public static void main(String[] args) {
		int ar[] = { 20, 30, 45, 21, 12, 11 };
		System.out.println("intial same value : ");
		for (int j =  0; j < ar.length; j++) {
			System.out.print(ar[j]+" ");
			}
		System.out.println();
		System.out.println("after reverse value : ");
		for (int j =  ar.length-1; j >-1 ; j--) {
			System.err.print(ar[j]+" ");
			}
	}

}
