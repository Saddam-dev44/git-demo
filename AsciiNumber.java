package MobileProgram;

public class AsciiNumber {

	public static void main(String[] args) {
		char[] a = {'a','b','c','d'};
		for(int i=0;i<a.length;i++) {
			int b=a[i];
			System.out.println(+b+".");
		}
		String str ="my mother";
		System.out.println(str.length());
		char[] charArray = str.toCharArray();
		System.out.println("charecters are "+charArray);
		for(int i=0;i<charArray.length;i++) {
			int str2 =charArray[i];
			System.out.print(str2+".");
		}
		System.out.println();
	System.out.println("=================================");
	String str3 ="my father";
	for(int i=0;i<str3.length();i++) {
		char at = str3.charAt(i);
		System.out.println(at);
		
	}


	
			int e[]= {10,33,40,60};
			for(int i=0;i<e.length;i++) {
				System.out.println(e[i]);
				String string = e.toString();
				System.out.println("String :"+string);
				char[] charArray2 = string.toCharArray();
				System.out.println("char"+charArray2);
			} 
				
			
}
}