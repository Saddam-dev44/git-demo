package MobileProgram;

public class SecondSmallestElement {
	public static void secondSmall(int arr[]) {
		int temp=0,i,j;
		for(i=0;i<arr.length;i++) {
			for(j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		for( i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("second largest array is : "+arr[1]);

	}

	public static void main(String[] args) {
	int	ar[] = {20,54,21,10,18,12};
	secondSmall(ar);

	}

}
