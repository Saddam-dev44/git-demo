package MobileProgram;

public class EvenOrOdd {
	public static void evenAndOddNum(int start, int end) {
		while (start < end) {

			if (start % 2 == 0) {
				System.out.println("the number is even number :" + start +" ");
			}
			start= start+1;

		}
		System.out.println("-----------------------------------");
	}
	

	public static void evenAndOddNumber(int start, int end) {

		while (start < end) {

			if ((start % 2) != 0) {
				System.out.println("the number is odd number: " + start);
			}
			start = start + 1;
		}
	}

	public static void main(String[] args) {
		evenAndOddNum(1, 20);
		evenAndOddNumber(1, 20);
	}

}
