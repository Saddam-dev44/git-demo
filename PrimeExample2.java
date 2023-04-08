package MobileProgram;

import java.util.Scanner;

public class PrimeExample2 {
	public static boolean isPrime(int n) {
		if(n<=1) {
			//System.out.println(+n+":is not a prime number");
			return false;
		}

			for(int i=2;i<=Math.sqrt(n);i++) {
				if(n%i==0) {
					return false;
				}
			}
		
		return true;
	}
	
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first prime num:");
		int Start = sc.nextInt();
		System.out.println("Enter the second prime num:");
		int End =sc.nextInt();
		System.out.println("the Prime number btween"+Start+ "and"+End);
		for(int i= Start;i<=End;i++) {
			if(isPrime(i)) {
				System.out.println(+i);
			}
		}

	}

}
