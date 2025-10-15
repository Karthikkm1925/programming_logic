package com.array.programs;

import java.util.*; 
class  PushZeroesToRightWithoutTemp {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter The Array Elements");
        for(int i =0; i<size;i++){
            arr[i]=sc.nextInt();
        }
         
         int i=0;
         int j=0;
        while(i<size){
            if(arr[i]!=0){
                if(i!=j){
                    arr[i]=arr[i]+arr[j]-(arr[j]=arr[i]);
                }
                j++;
            }
            i++;
        }
         System.out.println(Arrays.toString(arr));
         
    }
}
