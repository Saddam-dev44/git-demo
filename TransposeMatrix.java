package MobileProgram;

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
		int i, j;
		System.out.println("Enter the total rows and colunms: ");
		Scanner s = new Scanner(System.in);
		int row = s.nextInt();
		int col = s.nextInt();
		int array[][] = new int[row][col];
		System.out.println("Enter the matrix:");
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				array[i][j] = s.nextInt();
			}

		}
		System.out.println(" ");

		System.out.println("The above matrix before transpose is:");
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println(" ");

		}
		System.out.println(" ");

		System.out.println("The after matrix before transpose is:");
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				System.out.print(array[j][i] + " ");
			}
			System.out.println(" ");

		}
		System.out.println(" ");
	}

}
