package MobileProgram;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt(),a,c=0,temp;//153
		temp=n;							//temp=153
		while(n>0) {					//loop postive it will stop
			a=n%10;						//rem 3,5,1,stop at 0 assign to a=351 and also runs negitve also souse dive
			n=n/10;						//used divison for stop the loop
			c=c+(a*a*a);					//1st etiration c=0+(3*3*3)=27||2nd etiration c=27+(5*5*5)=27+125=152||
			System.out.println(a);			///3rd etiration c=152+(1*1*1)=152+1=153||
		}
		if(temp==c)
			System.out.println(+c+" "+ "its a Armstrong number");
		else
			System.out.println(+c+" "+ "its not a Armstrong number");
	}

}
