package practice.java.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesis {

    public static void main(String[] args) {
        int n = 3;
        List<String> ansList = new ArrayList<>();
        generateParanthesis(n, 0 ,0, "", ansList);
        System.out.println(ansList);
    }

    public static void generateParanthesis(int n, int open, int close, String ans, List<String> ansList) {
        if(open == n && close == n) {
           ansList.add(ans);
            return;
        }
        //open and close can never be greater than n
        if(open > n || close > n) {
            return;
        }
        generateParanthesis(n, open+1, close, ans + "(", ansList);
        generateParanthesis(n, open, close+1, ans + ")", ansList);
    }
}
