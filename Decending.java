package MobileProgram;

public class Decending {

	public static void main(String[] args) {
		int ar[] = { 20, 30, 45, 21, 12, 11 };
		int store = 0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] > ar[j]) {
					store = ar[j];
					ar[j] = ar[i];
					ar[i] = store;
				}
			}

		}
		System.out.println();
		System.out.println("element of the sorted in desending order: ");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] +" ");
		}
	}

}
