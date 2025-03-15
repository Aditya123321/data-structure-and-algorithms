package practice.java.leetcode.stack.premium.questions;

import java.util.Stack;

public class MaximalRectangle {

    public static void main(String[] args) {
        char[][] matrix = {{'1', '0', '1', '0', '0'}, {'1', '0', '1', '1', '1'}, {'1', '1', '1', '1', '1'}, {'1', '0', '0', '1', '0'}};
       // getMaximalRectangle(matrix);
        int ans = 0;
        int[] arr = new int[matrix[0].length];
        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == '1') {
                    arr[j]++;
                } else {
                    arr[j] = 0;
                }
            }
            ans = Math.max(ans, getMaximalRectangle(arr));
        }
    }

    private static int getMaximalRectangle(int[] arr) {
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

            return ans;
        }
    }

