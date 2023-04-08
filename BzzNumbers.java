package MobileProgram;

import java.util.Scanner;

public class BzzNumbers {
	public boolean checkNumber(int number) {
		if (number % 10 == 7 || number % 7 == 0) {
			System.out.println(+number + " : the number is a buzz number");
			return true;
		} //else
		//	System.out.println(+number + " : the number is not a buzz number");
		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BzzNumbers B = new BzzNumbers();
		int range=sc.nextInt();
		for (int i=1;i<range;i++) {
			B.checkNumber(i);
		}
		
		

	}

}
