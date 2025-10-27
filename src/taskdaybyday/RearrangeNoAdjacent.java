package taskdaybyday;

public class RearrangeNoAdjacent {

    public static String rearrange(String s) {
        int n = s.length();
        int[] freq = new int[26]; // for lowercase letters a-z

        // Step 1: Count frequency
        for (int i = 0; i < n; i++) {
            freq[s.charAt(i) - 'a']++;
        }

        // Step 2: Find max frequency
        int maxFreq = 0;
        int maxCharIndex = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                maxCharIndex = i;
            }
        }

        // Step 3: Check if rearrangement is possible
        if (maxFreq > (n + 1) / 2) {
            return "Not Possible";
        }

        // Step 4: Fill result array
        char[] result = new char[n];
        int index = 0;

        // Place the most frequent character first at even indices
        while (freq[maxCharIndex] > 0) {
            result[index] = (char) (maxCharIndex + 'a');
            index += 2;
            freq[maxCharIndex]--;
        }

        // Place remaining characters
        for (int i = 0; i < 26; i++) {
            while (freq[i] > 0) {
                if (index >= n) index = 1; // move to odd indices
                result[index] = (char) (i + 'a');
                index += 2;
                freq[i]--;
            }
        }

        return new String(result);
    }

    public static void main(String[] args) {
        String s1 = "aaabbc";
        String s2 = "aaab";

        System.out.println(rearrange(s1)); // e.g., "ababac"
        System.out.println(rearrange(s2)); // "Not Possible"
    }
}

