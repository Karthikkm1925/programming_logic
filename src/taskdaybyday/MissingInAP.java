package taskdaybyday;

public class MissingInAP {
    public static void main(String[] args) {
        int[] arr = {4, 12, 16, 20}; 

        int n = arr.length + 1;

         
        int min = arr[0], max = arr[0], sum = 0;
        for (int num : arr) {
            if (num < min) 
            	min = num;
            if (num > max) 
            	max = num;
            sum += num;
        }
         
        int expectedSum = n * (min + max) / 2;

        int missing = expectedSum - sum;
        System.out.println("Missing number: " + missing);
    }
}
