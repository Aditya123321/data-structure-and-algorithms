package practice.java.backtracking;

public class QueenCombination {

    public static void main(String[] args) {

    }

    public static void combination(boolean [] board, int tq  , int qpsf, String ans, int idx) {
        for(int i=idx; i< board.length; i++){
            if(board[i] == false) {
                board[i] = true;
                combination(board, tq, qpsf+1, ans+"b"+i+"q"+qpsf, i+1);
                board[i] = false;
            }
        }
    }
}
