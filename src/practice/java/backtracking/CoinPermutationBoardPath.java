package practice.java.backtracking;

public class CoinPermutationBoardPath {

    public static void main(String[] args) {
        int coin [] = {1,2,3};
        int amount =4;
    }

    public static void Permutation(int [] coin, int amount  , String ans) {
        for(int i=0; i< coin.length; i++){
            if(amount >= coin[i]) {
                Permutation(coin, amount-coin[i], ans+coin[i]);
            }
        }
    }
}
