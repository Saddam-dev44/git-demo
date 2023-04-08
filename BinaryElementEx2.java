package MobileProgram;

public class BinaryElementEx2 {
	public static int binarySearch(int arr[],int first,int last,int key) {
		if(last>=first) {
		int	mid =first+(last-first)/2;
		 if(arr[mid]==key) {
			 return mid;
			 }
		 if(arr[mid]<key) {
			 return binarySearch(arr, mid+1, last, key);
		 }else 
			 return binarySearch(arr, first, mid-1, key);
		 
		 }
		return -1;
		
	}

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60,70,80};
		int key=70;
		int first=0;
		int last =arr.length-1;
		int result =binarySearch(arr, first, last, key);
		if(result==-1) {
			System.out.println("Element are not present the array");
		}else {
			System.out.println("Element present at index : "+result);
		}

	}

}
