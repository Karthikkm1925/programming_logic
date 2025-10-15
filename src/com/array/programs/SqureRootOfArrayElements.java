package com.array.programs;

import java.util.*; 
class  SqureRootOfArrayElements {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter The Array Elements");
        for(int i =0; i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
        System.out.print(Heroins(arr[i])+",");
        }        
    }
        public static double Heroins(double n){
            
            double x=n;
            if(n==0||n==1){
                return n;
            } 
            
            for(int i=0;i<10;i++){
                x=0.5*(x+n/x);
            }
            return x;
        } 
}