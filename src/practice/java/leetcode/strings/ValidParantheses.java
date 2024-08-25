package practice.java.leetcode.strings;

import java.util.Stack;

public class ValidParantheses {
    public static void main(String[] args) {
        String parantheses = "{}[]()";
        System.out.print(isValid(parantheses));
    }
    public static boolean isValid(String s) {
        if((s.length()) % 2 != 0) {
            return false;
        }

        Stack<Character> paranthesesStack = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '(' || c == '{' || c == '[') {
                    paranthesesStack.push(c);
                }
                else if (c == ')' || c == '}' || c == ']') {
                    if (paranthesesStack.isEmpty()) {
                        return false;
                    }
                    char top = paranthesesStack.pop();
                    if (c == ')' && top != '(' || c == '}' && top != '{' || c == ']' && top != '[') {
                        return false;
                    }
                }
            }
            if (!paranthesesStack.isEmpty()) {
                return false;
            }
            return true;
        }
    }

