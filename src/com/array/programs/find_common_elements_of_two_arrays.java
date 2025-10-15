package com.array.programs;

public class find_common_elements_of_two_arrays {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5,6};
		int[] arr2 = {3,4,5,6,7,8};
		
		for (int i = 0; i < arr1.length; i++) {
			boolean flag=true;
			for (int j =0; j < arr2.length; j++) {
				if(arr1[i]==arr2[j]) {
					System.out.print(arr1[i]+" ");
					break;
				}
			}
		}
	}

}
