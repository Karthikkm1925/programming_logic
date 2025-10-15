package com.array.programs;

import java.util.*;
class max_min_in_one_pass {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter The Array Elements");
        for(int i =0; i<size;i++){
            arr[i]=sc.nextInt();
        }
        
        int min=arr[0];
        int max=arr[0];
        int j = arr.length;
        
        for(int i=0; i<size;i++){
            if(arr[i]>min){
                min = arr[i];
            }else if(arr[i]<max){
                max = arr[i];
            }
        }
        System.out.println("Max is "+max+" Min is "+min);
    }
}
