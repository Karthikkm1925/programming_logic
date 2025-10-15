package com.array.programs;


import java.util.*;
class sum_of_array_elements {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter The Array Elements");
        for(int i =0; i<size;i++){
            arr[i]=sc.nextInt();
        }
        
        long sum =0;
        for(int i=0; i<size;i++){
            sum+=arr[i];
        }
        System.out.println("Sum is "+sum);
    }
}