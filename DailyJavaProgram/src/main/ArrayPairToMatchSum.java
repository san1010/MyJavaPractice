package main;

public class ArrayPairToMatchSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,5,7,9,11,3,81,6,8};
		int len =arr.length;
		int sum = 14;
		pairwithsum(arr,len, sum);
	}

	private static void pairwithsum(int[] l_arr, int l_len, int l_sum) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < (l_len-1); i++) {
			for (int j = i+1; j < l_arr.length; j++) {
				if(l_arr[i]+l_arr[j]==l_sum) {
					System.out.println("Pair with given sum " + l_sum+ " is (" + l_arr[i] +", "+l_arr[j]+")");
				}
			}
			
		}
	}
	
	

}
