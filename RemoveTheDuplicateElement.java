package MobileProgram;

import java.util.Arrays;

public class RemoveTheDuplicateElement {
	public static int removeDuplicate(int arr[],int n) {
		if(n==0||n==1) {
			return n;
		}
		int temp[] = new int[n];
		int j=0;
		for (int i=0;i<n-1;i++) {
			if (arr[i]!= arr[i+1]) {
				temp[j++] = arr[i];

			}
		}
		temp[j++] = arr[n-1];
		for(int i=0;i<j;i++) {
			arr[i]=temp[i];
		}
		return j;
	}

	public static void main(String[] args) {
		int ar[] = {10,10,12,18,20,21,30,40,50,54};//10,12,18,20,21,30,40,50,54
		Arrays.sort(ar);
		int n = ar.length;
		n = removeDuplicate(ar,n);
		for (int i=0;i<n;i++) 
			System.out.print(ar[i] + " ");
	}
}
