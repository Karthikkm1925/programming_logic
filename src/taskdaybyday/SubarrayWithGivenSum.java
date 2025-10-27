package taskdaybyday;

import java.util.Arrays;

public class SubarrayWithGivenSum {

    public static void findSubarray(int[] arr, int S) {
        int start = 0, currentSum = 0;

        for (int end = 0; end < arr.length; end++) {
            // add current element to currentSum
            currentSum += arr[end];

            // shrink the window from the start if currentSum > S
            while (currentSum > S && start <= end) {
                currentSum -= arr[start];
                start++;
            }

            // check if currentSum equals target
            if (currentSum == S) {
                System.out.print("Subarray found: ");
                System.out.print("[");
                for (int i = start; i <= end; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.print("]");
                return;
            }
        }

        System.out.println("No subarray found with sum " + S);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int S = 12;
        System.out.println("Given Array Elements : "+ Arrays.toString(arr));
        findSubarray(arr, S);
    }
}
