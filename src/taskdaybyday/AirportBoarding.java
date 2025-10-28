package taskdaybyday;
import java.util.*;
class AirportBoarding {

    public static void main(String[] args) {
        int[] actual = {101, 103, 102, 104};
        System.out.println("Actual order"+Arrays.toString(actual));
        int count = countOutOfOrder(actual);
        System.out.println("Toatal Miss Match is "+count);
    }

    static int countOutOfOrder(int[] actual) {
        int n = actual.length;

        // make a copy manually
        int[] expected = new int[n];
        for (int i = 0; i < n; i++) {
            expected[i] = actual[i];
        }

        // bubble sort to get expected order
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (expected[j] > expected[j + 1]) {
                	// a = a+b-(b=a)
                	expected[j]=expected[j]+expected[j+1]-(expected[j+1]=expected[j]);
                
                /*  using third variable
                    int temp = expected[j];
                    expected[j] = expected[j + 1];
                    expected[j + 1] = temp;
                */
                }
            }
        }
        System.out.println("Expected order"+Arrays.toString(expected));
        // count mismatched positions
        int mismatch = 0;
        for (int i = 0; i < n; i++) {
            if (actual[i] != expected[i]) {
                mismatch++;
            }
        }

        // if 2 elements swapped → 2 mismatches → 1 passenger pair
        return mismatch / 2;
    }
}

