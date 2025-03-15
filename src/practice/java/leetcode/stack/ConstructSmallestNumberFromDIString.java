package practice.java.leetcode.stack;

import java.util.Stack;

public class ConstructSmallestNumberFromDIString {

    public static void main(String[] args) {
        String s =  "IIIDIDDD";
        System.out.println(smallestString(s));

    }
    public static String smallestString(String s) {
          int[] ans = new int[s.length()+1];
          int count = 1;
          Stack<Integer> st = new Stack<>();
          for(int i =0; i<=s.length(); i++) {
              if(i ==  s.length() || s.charAt(i) == 'I') {
                  ans[i] = count;
                  count++;
                  while(!st.isEmpty()) {
                      ans[st.pop()] = count;
                      count++;
                  }
              } else {
                  st.push(i);
              }
          }

          String result = "";
          for(int i =0; i<ans.length; i++) {
              result+=ans[i];
          }
          return result;


    }
}

