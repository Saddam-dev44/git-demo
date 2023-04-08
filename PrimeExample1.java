package MobileProgram;

public class PrimeExample1 {
	
	public static void primeNumber(int n) {
		int m,flag=0;
		m=n/2;
		if(n==0||n==1) {
			System.out.println(+n+ ":is not a prime number");
		}else {
			for(int i=2;i<=m;i++) {
				if(n%i==0) {
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

	public static void main(String[] args) {
		primeNumber(3);
		primeNumber(5);
		primeNumber(9);
		primeNumber(10);
		primeNumber(13);
		primeNumber(15);

		
			}

}
