package MobileProgram;

public class AsendingOrder {
	public static void asendOR(int arr[]) {
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}System.out.println();
		System.out.println("element of the sorted in asending order: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("element of the sorted in desending order: ");
		
		for(int i=arr.length-1;i>0;i--) {
			System.out.print(arr[i]+" ");
	
			
		}
	}
			
		


	public static void main(String[] args) {
		int a[]={23,45,65,99,78,100};
		asendOR(a);
		

		

}
}