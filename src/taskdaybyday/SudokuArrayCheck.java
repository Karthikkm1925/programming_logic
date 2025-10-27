package taskdaybyday;

public class SudokuArrayCheck {

    public static boolean isValidSudoku(int[][] board) {

        // ---- Check each row ----
        for (int i = 0; i < 9; i++) {
            boolean[] seen = new boolean[10]; // index 1–9
            for (int j = 0; j < 9; j++) {
                int num = board[i][j];
                if (num == 0) continue; // skip empty
                if (seen[num]) return false; // duplicate
                seen[num] = true;
            }
        }

        // ---- Check each column ----
        for (int j = 0; j < 9; j++) {
            boolean[] seen = new boolean[10];
            for (int i = 0; i < 9; i++) {
                int num = board[i][j];
                if (num == 0) continue;
                if (seen[num]) return false;
                seen[num] = true;
            }
        }

        // ---- Check each 3×3 box ----
        for (int boxRow = 0; boxRow < 9; boxRow += 3) {
            for (int boxCol = 0; boxCol < 9; boxCol += 3) {

                boolean[] seen = new boolean[10];

                // Loop inside 3x3 grid
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        int num = board[boxRow + i][boxCol + j];
                        if (num == 0) continue;
                        if (seen[num]) return false;
                        seen[num] = true;
                    }
                }
            }
        }

        return true; // no duplicates found
    }

    public static void main(String[] args) {
        int[][] board = {
            {5,3,0,0,7,0,0,0,0},
            {6,0,0,1,9,5,0,0,0},
            {0,9,8,0,0,0,0,6,0},
            {8,0,0,0,6,0,0,0,3},
            {4,0,0,8,0,3,0,0,1},
            {7,0,0,0,2,0,0,0,6},
            {0,6,0,0,0,0,2,8,0},
            {0,0,0,4,1,9,0,0,5},
            {0,0,0,0,8,0,0,7,9}
        };

        System.out.println(isValidSudoku(board) ? "Valid Sudoku" : "Invalid Sudoku");
    }
}

