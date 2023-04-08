package MobileProgram;

import java.util.Scanner;

public class FindLcm {
	public static void FindLcmNumber(int a, int b) {
		int lcm = 0, hcf = 0, change, num1, num2;
		num1 = a;
		num2 = b;
		while (num2 != 0) {
			if (num1 >= num2) {
				change = num2;
				num2 = num1 % num2;
				num1 = change;
				hcf = num1;
				lcm = (a * b) / hcf;
			} else {
				System.err.println("the num1 most be greater then num2  ");
				break;
				
			}
		}
		System.out.println("HCF of the given " + a + " and " + b + " is : " + hcf);
		System.out.println("LCM of the given " + a + " and " + b + " is : " + lcm);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number n1 :");
		int a = sc.nextInt();
		System.out.println("enter the first number n2 :");
		int b = sc.nextInt();
		FindLcmNumber(a, b);

	}

}
