package MobileProgram;

public class BinaryElementsEx {
	
	public static void binarySearch(int arr[],int first,int last,int key) {
			int mid=(first+last)/2;	//{20,30,10,50,20}	4/2==2
			while(first<=last) {
			if(arr[mid]<key) {
				first=mid+1;
			}else if(arr[mid]==key) {
				System.out.println("element at found index: "+mid);
				break;
			}else {
				last=mid-1;
				
			}
			 mid=(first+last)/2;
			}
			
			if(first>last) {
				System.out.println("element not found at index");
			}	
		}
		
	

	public static void main(String[] args) {
		int []arr = {10,30,50,70,90};
		int last=arr.length-1;
		int key=90;
		binarySearch(arr, 0, last, key);
				
		

	}
}
