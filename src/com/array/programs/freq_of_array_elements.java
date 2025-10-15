package com.array.programs;


class freq_of_array_elements{
    
    public static void main(String[] arg){
        int[] arr = {1,1,1,2,2,2,3,4,4,5,5,5,6};
        boolean[] visited = new boolean[arr.length];
        
        for(int i=0;i<arr.length;i++){
            if(visited[i])
            continue;
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    visited[j]=true;
                     
                }
            }
            System.out.println(arr[i]+" repeated "+count+" times");
        }
    }
}
