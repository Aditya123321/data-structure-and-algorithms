package practice.java.backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinatonSum {

    public static void main(String[] args) {
        int coin [] = {1,2,3};
        int amount =4;
        List<Integer> ll = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Combination(coin,amount,ll,0,ans);
    }

    public static void Combination(int [] coin, int amount  , List<Integer> ll, int idx, List<List<Integer>> ans) {
        for(int i=idx; i< coin.length; i++){
            if(amount == 0) {
                ans.add(new ArrayList<>(ll));
                return;
            }
            if(amount >= coin[i]) {
                ll.add(coin[i]);
                Combination(coin, amount-coin[i], ll, i, ans);
                ll.remove(ll.size()-1);
            }
        }
    }
}
