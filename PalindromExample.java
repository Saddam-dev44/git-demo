package MobileProgram;

public class PalindromExample {
	public static void palindr(int n) {
		int temp, sum=0,m ;
		temp=n;
		while(n>0) {
			m=n%10;//getting the reminder..
			sum=(sum*10)+m;
			n=n/10;
		}
			if(temp==sum) 
			{
				System.out.println("the number is a palimdrom number");
			}
			else {
				System.out.println("the number is not a palindrom number");
			}
			
		}
	

	public static void main(String[] args) {
		palindr(424);	
		palindr(123);
		palindr(124);
		palindr(121);
		palindr(432);
		palindr(424);
		


		
		

	}

}
