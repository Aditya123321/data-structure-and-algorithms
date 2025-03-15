package practice.java.leetcode.stack.premium.questions;

import java.util.Stack;

public class LargestRectangleInHistogram {

    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,1,7};
        getLargestRectangleInHistogram(arr);
    }

    private static void getLargestRectangleInHistogram(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int ans = 0;

        for( int i =0 ; i< arr.length; i++){
            //check for all greater elements to get next smaller elements
            while(!st.isEmpty() && arr[i] < arr[st.peek()]) {
                int h =  arr[st.pop()];
                int r = i;
                if(st.isEmpty()) {
                    ans = Math.max(ans, h * r);
                } else {
                    int l = st.peek();
                    ans = Math.max(ans, h * (r - l -1)
                    );

                }
            }

            st.push(i);
        }

        int r = arr.length;
        while(!st.isEmpty() ) {
            int h =  arr[st.pop()];
            if(st.isEmpty()) {
                ans = Math.max(ans, h *r);
            } else {
                int l = st.peek();
                ans = Math.max(ans, h * (r - l -1)
                );

            }
        }

            System.out.println(ans);
        }
    }
}
