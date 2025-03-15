package practice.java.backtracking;

public class QueenPermutation {

    public static void main(String[] args) {

    }

    public static void Permutation(boolean [] board, int tq  , int qpsf, String ans) {
        for(int i=0; i< board.length; i++){
            if(board[i] == false) {
                board[i] = true;
                Permutation(board, tq, qpsf+1, ans+"b"+i+"q"+qpsf);
                board[i] = false;
            }
        }
    }
}
