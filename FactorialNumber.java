package MobileProgram;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the factorial number is :");
		int a= sc.nextInt(),fact =1;
		for(int i=1;i<=a;i++) {
			fact =fact*i;
		}	
		System.out.println("Factorial of a is:"+fact);
	}
}
