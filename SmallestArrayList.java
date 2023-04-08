package MobileProgram;

public class SmallestArrayList {
	public static void smallestArrau(int arr[]) {
		int min=arr[0],i;
		for(i=0;i<arr.length;i++) {
			if(arr[i]<=min) {
				min=arr[i];
				System.out.print(min+" ");
			}
		}
		System.out.println("min value in the array is :" +min);
		
	
	}

	public static void main(String[] args) {
	int arr[]= {20,30,54,24,12,10,18};
	smallestArrau(arr);
 	}

}
