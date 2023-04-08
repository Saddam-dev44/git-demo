package MobileProgram;

public class BubbleSorting {
	public static void bubbleSort(int arr[]) {
		int temp;
		int n=arr.length;
		for(int i=0;i<n;i++) {
			for(int j=1;j<(n-i);j++){
				if(arr[j-1]>arr[j]) {
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	

	public static void main(String[] args) {
		int arr[]= {23,25,4,14,144,87};
		System.out.println("Before array elemenrs are :");
		for(int i=0;i<arr.length;i++) {
		
			System.out.print(+arr[i]+ " ");
		}
		System.out.println(" ");
		
		System.out.println("after array elements : " );
		bubbleSort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(+arr[i]+ " ");

		}

	}

}
