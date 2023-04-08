package MobileProgram;

public class FactorialRecursion {
	public static int factRec(int n) {
		if(n==0) 
			return 1;
		else
			return(n*factRec(n-1));//5*factRec(4*factRec(3*factRec(2*factRec(1*factRec(0))))))
		}
public static void main(String[] args) {

int fact =factRec(5);
System.out.println("factorial of 5:"+fact);
	}

}
