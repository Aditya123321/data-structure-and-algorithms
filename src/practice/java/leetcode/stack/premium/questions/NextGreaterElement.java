package practice.java.leetcode.stack.premium.questions;

import java.util.Stack;

public class NextGreaterElement {

    public static void main(String[] args) {
         int[] arr = {11,13,21,3};
         findNextGreaterElement(arr);
    }

    private static void findNextGreaterElement(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];

        for( int i =0 ; i< arr.length; i++){
            while(!st.isEmpty() && arr[i]>arr[st.peek()]) {
                ans[st.pop()] = arr[i];
            }
            st.push(i);
        }
        while(!st.isEmpty()) {
            ans[st.pop()] = -1;
        }

        for(int i =0 ; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
