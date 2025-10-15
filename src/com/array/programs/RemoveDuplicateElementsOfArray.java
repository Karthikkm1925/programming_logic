package com.array.programs;

public class RemoveDuplicateElementsOfArray {

	public static void main(String[] args) {
		
			int[] arr = {1,2,3,4,4,5,5,6,7,8,9,10,11,11,12,13};
			
			for (int i = 0; i < arr.length; i++) {
				boolean flag=true;
				for (int j = 0; j < arr.length; j++) {
					if(i!=j&&arr[i]==arr[j]) {
						flag=false;
						break;
					}
				}
				if(flag)
					System.out.print(arr[i]+" ");
			}
	}

}
