package com.array.programs;

public class second_largest_second_smallest_element_in_Array {
	public static void main(String[] args) {
		
		int[] arr = {7,5,8,6,9,101,99,98,100};
		int max=arr[0];
		int min=arr[arr.length-1];
		int secMax=arr[0];
		int secSmall=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Largest Element is : "+max+" \nSmallest Element is : "+min);
		for(int j=0;j<arr.length;j++) {
			if(arr[j]!=max&&arr[j]>secMax) {
				secMax=arr[j];
			}
			if(arr[j]!=min&&arr[j]<secSmall) {
				secSmall=arr[j];
			}				
		}
		System.out.println("Second largest element is: "+secMax+" \nSecond smallest element is:  "+secSmall);
}
}
