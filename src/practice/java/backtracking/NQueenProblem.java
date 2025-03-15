package practice.java.backtracking;

public class NQueenProblem {

    public static void main(String[] args) {
        int n =4;

        boolean[][] board =  new boolean[n][n];
        print(board, n, 0);

    }

    public static void print(boolean[][] board, int tq, int row ) {
        if(tq==0) {
            display(board);
            System.out.println();
            return;
        }
        for(int col =0; col<board[0].length; col++) {
            if(isSafe(board,row,col)) {
                board[row][col] = true;
                print(board, tq-1, row+1);
                board[row][col] = false;
            }
        }
    }

    public static void display(boolean[][] board) {
        for(int i=0;i<board.length;i++) {
            for(int j = 0; j<board.length; j++) {
                System.out.print(board[i][j] + "");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(boolean[][] board, int row, int col) {
        //move in upward direction
        int r = row;
        while(r>=0) {
            if(board[r][col]) {
                return false;
            }
            r--;
        }

        //left diagonal
        r= row;
        int c =  col;
        while(r>=0 && c >=0) {
            if(board[r][c]) {
                return false;
            }
            r--;
            c--;
        }

        //right diagonal
        r= row;
        c =  col;
        while(r>=0 && c < board[0].length) {
            if(board[r][c]) {
                return false;
            }
            r--;
            c++;
        }
        return true;
    }


}
