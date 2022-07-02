package main;

public class ArrayNextGretestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 13, 7, 6, 12 };
		int n = arr.length;
		printNGE(arr, n);

	}

	static void printNGE(int[] arr, int n) {
		// TODO Auto-generated method stub
		int next, i, j;

		for (i = 0; i < n; i++) {
			next = -1;
			for (j = i + 1; j < n; j++) {
				if (arr[j] > arr[i]) {
					next = arr[j];
					break;

				}

			}
			System.out.println( arr[i]+" --> " + next);
		}
	}

}
