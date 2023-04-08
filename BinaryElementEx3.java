package MobileProgram;

import java.util.Arrays;

public class BinaryElementEx3 {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,56,60,70,88};
		int key =30;
		int result=Arrays.binarySearch(arr, key);
		if(result<0) {
			System.out.println("Element not found..!");
		}else {
				System.out.println("Element found at :"+result);
		}
	}

}
