package com.array.programs;
import java.util.Arrays;
public class separate_0_NonZero_Elements_and_sort {
	public static void main(String[] args) {
		int[] arr = {1,0,3,0,0,2,4};//[1 2 3 4 0 0 0]
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
			count++;
			}
		}
		System.out.println(count);
		int j=0;
		int[] temp=new int[count];
		for(int i=0; i<arr.length;i++) {
			if(arr[i]!=0) {
				temp[j++]=arr[i];
			}
		}
		Arrays.sort(temp);
		System.out.println(Arrays.toString(temp));
		
		int k=0;
		int[] finalarray= new int[arr.length];
		for(int i=0; i<temp.length;i++) {
			finalarray[k++]=temp[i];
		}
		System.out.println(Arrays.toString(finalarray));
	}

}
