package MobileProgram;

public class GcdFactor {

	public static void gcd(int a, int b) {
		int r, GCD = 0;
		while (b != 0) {

			r = b;//// r=b it means r==8
			b = a % b;// 12%8==4==b

			a = r;
			GCD = a;
		}
		System.out.println("GCD of the number is :" + GCD);

	}

	public static void main(String[] args) {
		gcd(3768, 1701);

	}

}
