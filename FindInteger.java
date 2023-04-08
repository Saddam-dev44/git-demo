package MobileProgram;

public class FindInteger {
	public static void main(String[] args) {
	
	int a= 1234;
	int b =3412;
	String c=Integer.toString(a);
	String d= Integer.toString(b);
	System.out.println(c);
	System.out.println(d);

	for(int i=0;i<c.length();i++) {
	char ch = c.charAt(i);
	 	for(int j=0;j<d.length();j++) {
			char ch2 =d.charAt(j);
			System.out.println(ch2);
				if(ch==ch2) {
				System.out.println(ch2 +" "+"present in"+" "+ c);
			}
		
		}
	}
}
}

