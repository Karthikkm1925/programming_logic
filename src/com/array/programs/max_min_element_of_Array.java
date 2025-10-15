package com.array.programs;

public class max_min_element_of_Array {

	public static void main(String[] args) {
			int[] arr = {5,8,6,9,100,99};
			int max=arr[0];
			int min=arr[arr.length-1];
  
			for (int i = 0; i < arr.length; i++) {
				if(arr[i]>max) {
					max=arr[i];
				}
				if(arr[i]<min) {
					min=arr[i];
				}
			}
			System.out.println("Largest Element is : "+max+" \nSmallest Element is : "+min);
 	}

}
