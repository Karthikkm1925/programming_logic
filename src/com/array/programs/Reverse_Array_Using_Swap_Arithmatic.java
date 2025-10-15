package com.array.programs;

import java.util.*;

class  Reverse_Array_Using_Swap_Arithmatic {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter array size");
     int size = sc.nextInt();
     int[] arr = new int[size];
     System.out.println("Enter The Array Elements");
     for(int i =0; i<size;i++){
         arr[i]=sc.nextInt();
     }
     System.out.println("Original Array "+ Arrays.toString(arr));
     System.out.println("Array after reversed using swap method "+Arrays.toString(swap(arr)));
 }
 
 public static int[] swap(int[] arr){
     
     int i=0;
     int j=arr.length-1;
     
     while(i<j){
         arr[i] = arr[i]+arr[j]-(arr[j]=arr[i]);
         i++;
         j--;
     }
     
     return arr;
 }
}
