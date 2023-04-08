package MobileProgram;

import java.util.Scanner;

public class LinearAnother {
	public static void main(String[] args) {
		int c,n,search,array[];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of element: ");
		n=sc.nextInt();
		array =new int[n];
		System.out.println("Enter those " +n+ " elements");
		for(c=0;c<n;c++) {
			array[c]=sc.nextInt();}
			System.out.println("enter the value to be found: ");
			search =sc.nextInt();
			for(c=0;c<n;c++) {
				if(array[c]==search) {
				System.out.println(search+" is present at location :" +(c)+".");
				break;
			}}
			if(c==n)
				System.out.println(search+" is not present at location");

	}

}
