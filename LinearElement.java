package MobileProgram;

public class LinearElement {
 public static int linearA(int[]arr,int key) {
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==key) {
			return i;
		}
		} 
	return -1;
	 
 		}
	public static void main(String[] args) {
		int[] array= {10,20,30,40,50,60,70};
		int k =70;
		linearA(array, k);
		System.out.println(k + " is found at index: "+linearA(array, k));

	}

}
