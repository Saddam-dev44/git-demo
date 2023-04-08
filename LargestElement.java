package MobileProgram;

import java.util.Scanner;

public class LargestElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.println("enter the array length : ");
		int a=sc.nextInt();
		int Array[]=new int[10];
	//	int max= Array[0];
		System.out.println("enter the array elements : ");
		for( i=0;i<=a;i++) {
			Array[i]=sc.nextInt();
		
		if(Array[i]>Array[0]){
			Array[0]=Array[i];
			
		}
		
		}
	System.out.println(+Array[0]);


		for( i=0;i<a+1;i++) {
			
			System.out.print(" "+Array[i]);
			
		}
	
	}
}
