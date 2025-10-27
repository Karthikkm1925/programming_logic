package taskdaybyday;

public class SmallestRepeatingUnitBasic {

    public static String findRepeatingUnit(String s) {
        int n = s.length();

        // try all lengths from 1 to n/2
        for (int len = 1; len <= n / 2; len++) {
            if (n % len != 0) 
            	continue; // length must divide n

            boolean match = true;
            String unit = s.substring(0, len);

            // check the whole string in chunks of size 'len'
            for (int i = len; i < n; i += len) {
                if (!s.substring(i, i + len).equals(unit)) {
                    match = false;
                    break;
                }
            }

            if (match) 
            	return unit; // found the smallest repeating unit
        }

        return s; // no repeating unit found
    }

    public static void main(String[] args) {
        String s1 = "ababab";
        String s2 = "abcabc";
        String s3 = "aaaa";
        String s4 = "abcd";

        System.out.println(findRepeatingUnit(s1)); // Output: "ab"
        System.out.println(findRepeatingUnit(s2)); // Output: "abc"
        System.out.println(findRepeatingUnit(s3)); // Output: "a"
        System.out.println(findRepeatingUnit(s4)); // Output: "abcd"
    }
}

