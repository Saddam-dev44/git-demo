package MobileProgram;

import java.util.Scanner;

public class PrimeExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();//      9
		int i, m,flag=0;
		m = n/2;	// 9/2==3
		if(n==0||n==1) {
			System.out.println(+n+ ":is not a prime number");
		}
		else {
			for(i=2;i<=m;i++) {
				if(n%i ==0) {  	//(9%2==1 next loop 9%3==0)
				System.out.println(+n+ ":is not a prime number");
				flag=1;
				break;
				}
			}
			if(flag==0) {
				System.out.println(+n+ ":is a prime number");
			}
			
		}
		

	}

}
