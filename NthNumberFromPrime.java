package MobileProgram;

import java.util.Scanner;

public class NthNumberFromPrime {
	

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the nth number to find a prime :");
		int n=sc.nextInt();
		int count=0,num=0,i;
		while(count<n) {
			num= num+1;
			for(i=2;i<=num;i++) {
				if(num%i==0) {
					break;
				}
			}
			if(num==i) {
				count= count+1;
				System.out.println("the"+n+"nth prime number is : "+num);
			}
		}
	}

}
