package practice.java.stack;

import java.util.Stack;

public class InsertInLast {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        insertInLast(st, -7);
        System.out.println(st);

        reverseStack(st);
        System.out.println(st);

    }
    /*Function to insert element at the last of the stack
    which is against the natural insert order of stack
    * */
    public static void insertInLast(Stack<Integer> st, int item) {
           // st.addLast(item);
        if(st.isEmpty()) {
            st.push(item);
            return;
        }
        //the popped element will be stored in call stack of recursion
        int x = st.pop();
        insertInLast(st,item);
        //insert it while coming back from call stack of recursion
        st.push(x);

    }

    public static void reverseStack(Stack<Integer> st) {

        //return on empty
        if(st.isEmpty()) {
            return;
        }
        int x = st.pop();
        reverseStack(st);
        //insert as soon as you pop it
        insert(st,x);

    }

    public static void insert(Stack<Integer> st, int item) {
        //return on empty
        if(st.isEmpty()) {
            st.push(item);
            return;
        }
        int x = st.pop();
        insert(st, item);
        st.push(x);
    }
}
