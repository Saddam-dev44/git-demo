package MobileProgram;

public class pattren4 {
	public static void main(String[] args) {
		int lines = 8;
		int i, j;
		for (i = 1; i < lines; i++) {
			for (j = 1; j < lines / 2; j++) {
				if (i == j) {
					System.out.print(j);
				} else if (i >= 4 && j == lines - i) {
					System.out.print(j);
				} else {
					System.out.print("0");
				}

			}
			while (j > 0) {
				if (i == j) {
					System.out.print(j);
				} else if (i >= 4 && j == lines - i) {
					System.out.print(j);
				} else {
					System.out.print(" ");
				}
				j--;

			}
			System.out.println("");
		}
	}

}
