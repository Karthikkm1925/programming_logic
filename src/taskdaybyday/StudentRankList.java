package taskdaybyday;

class StudentRankList {
    public static void main(String[] args) {
        int[] marks = {80, 60, 80, 50}; // example input
        int n = marks.length;

        // Sort in descending order (simple O(n^2) sort)
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (marks[i] < marks[j]) {
                    int temp = marks[i];
                    marks[i] = marks[j];
                    marks[j] = temp;
                }
            }
        }

        // Assign and print ranks: same marks -> same rank; next different mark -> rank+1
        int currentRank = 1;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                // first element
                System.out.println(currentRank + ". " + marks[i]);
            } else {
                if (marks[i] == marks[i - 1]) {
                    // same marks as previous -> same rank
                    System.out.println(currentRank + ". " + marks[i]);
                } else {
                    // different mark -> increment rank and print
                    currentRank++;
                    System.out.println(currentRank + ". " + marks[i]);
                }
            }
        }
    }
}
