package practice.java.leetcode.stack.premium.questions;

import java.util.Stack;

public class ValidParantheses {

    public static void main(String[] args) {
        String s =  "()[]{}";
        System.out.println(isValid(s));
    }

    private static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            } else {
                if (st.isEmpty()) {
                    return false;
                } else {
                    if (ch == ')') {
                        if (st.peek() != '(') {
                            return false;
                        }
                        st.pop();

                    } else if (ch == '}') {
                        if (st.peek() != '{') {
                            return false;
                        }
                        st.pop();

                    } else {
                        if (st.peek() != '[') {
                            return false;
                        }
                        st.pop();

                    }
                }
            }
        }
        return st.size() == 0;

    }
}
