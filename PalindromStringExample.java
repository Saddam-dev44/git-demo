package MobileProgram;

public class PalindromStringExample {
	
	public static void pali() {
		
		String orginal ="MADAM";
		String reverse ="";
		for(int i=0;i<orginal.length();i++) {
			char ch=orginal.charAt(i);
			System.out.println(ch);
		reverse =ch+reverse;
		}
	
		System.out.println(reverse);
		System.out.println(orginal);
		if(orginal.equals(reverse)) 
			System.out.println("its  a palingdrome");
		else 
			System.out.println("its NOT a polingdrome");
			
	}		

				
	

	public static void main(String[] args) {
		pali();
		
	}}
