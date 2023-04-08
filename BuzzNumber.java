package MobileProgram;

public class BuzzNumber {
	public boolean checkNumber(int number) {
		if (number % 10 == 7 || number % 7 == 0) {
			System.out.println(+number + " : the number is a buzz number");
			return true;
		} else
			System.out.println(+number + " : the number is not a buzz number");
		return false;
	}

	public static void main(String[] args) {
		BuzzNumber Bz = new BuzzNumber();
		Bz.checkNumber(20);
		Bz.checkNumber(147);
		Bz.checkNumber(42);

	}

}
