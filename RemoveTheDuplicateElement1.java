package MobileProgram;

import java.util.Arrays;

public class RemoveTheDuplicateElement1 {
	public static int removeElements(int arr[],int n) {
		int i,j=0;
		if(n==0||n==1)
		return n;
	
		for(i=0;i<n-1;i++) {
			if(arr[i]!=arr[i+1]) {
				arr[j++]=arr[i];
				}
			}
		arr[j++]=arr[n-1];
		for(i=0;i<j;i++) {
		
			arr[i]=arr[i];
		System.out.print(arr[i]+" ");
		}
		return j;
		}
	public static void main(String[] args) {
		int arr[]= {20,12,15,18,14,10,12,14,20};
		Arrays.sort(arr);
		int n=arr.length;
		removeElements(arr, n);
	}

}
