package MobileProgram;

import java.util.Scanner;

public class NaturalNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the natural number to find : ");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++) {
			sum =sum+i;
		//.out.println("the natrual number is :" +sum);
		}
		System.out.println("=============================");
		System.out.println("the natrual number is :" +sum);

	}
	
}
