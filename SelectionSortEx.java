package MobileProgram;

public class SelectionSortEx {
	public static void selSort(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			// int index =i;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[j] < arr[i]) {
					// index=j;
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 20, 90, 50, 45, 100, 80 };
		System.out.println("before selection sort:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
		selSort(arr);
		System.out.println("after selection sort:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
