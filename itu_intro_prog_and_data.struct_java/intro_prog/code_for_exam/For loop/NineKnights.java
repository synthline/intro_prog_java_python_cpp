import java.util.Scanner;

public class NineKnights {
    public boolean isValid() {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        char[][] board = new char[n][n];
        for (int row = 0; row < n; row++) {
            String line = sc.nextLine();
            for (int col = 0; col < n; col++) {
                char c = line.charAt(col);
                board[row][col] = c;
            }
        }

        int numberOfKnights = 0;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (board[row][col] == 'k') {
                    numberOfKnights++;
                }
            }
        }
        if (numberOfKnights != 9) {
            return false;
        } else {

            for (int row = 0; row < n; row++) {
                for (int col = 0; col < n; col++) {
                    if (board[row][col] == 'k') {
                        if (row - 2 >= 0 && col + 1 < n && board[row - 2][col + 1] == 'k') {
                            return false;
                        } else if (row - 1 >= 0 && col + 2 < n && board[row - 1][col + 2] == 'k') {
                            return false;
                        } else if (row + 1 < n && col + 2 < n && board[row + 1][col + 2] == 'k') {
                            return false;
                        } else if (row + 2 < n && col + 1 < n && board[row + 2][col + 1] == 'k') {
                            return false;
                        } else if (row - 2 >= 0 && col - 1 >= 0 && board[row - 2][col - 1] == 'k') {
                            return false;
                        } else if (row - 1 >= 0 && col - 2 >= 0 && board[row - 1][col - 2] == 'k') {
                            return false;
                        } else if (row + 1 < n && col - 2 >= 0 && board[row + 1][col - 2] == 'k') {
                            return false;
                        } else if (row + 2 < n && col - 1 >= 0 && board[row + 2][col - 1] == 'k') {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}