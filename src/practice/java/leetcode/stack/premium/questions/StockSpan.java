package practice.java.leetcode.stack.premium.questions;

import java.util.Stack;

public class StockSpan {

    public static void main(String[] args) {
         int[] arr = {30,35,40,38,35};
        getStockSpan(arr);
    }

    private static void getStockSpan(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];

        for( int i =0 ; i< arr.length; i++){
            //check for all smaller elements
            while(!st.isEmpty() && arr[i]>arr[st.peek()]) {
               st.pop();
            }

            //span calculation logic
            if(st.isEmpty()) {
                ans[i] = i+1;
            } else {
                ans[i] = i - st.peek();
            }

            st.push(i);
        }
        for(int i =0 ; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
