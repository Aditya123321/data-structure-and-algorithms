package practice.java.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        System.out.println(getPascalsTriangle(5));
    }
    public static List<List<Integer>> getPascalsTriangle(int rows) {
         List<List<Integer>> container =  new ArrayList<>();
         container.add(List.of(1));
         for(int row = 0; row < rows-1; row++) {
             List<Integer> innerList = new ArrayList<>();
             //add the first 1 to the list
             innerList.add(1);
             for(int i = 0; i < container.get(row).size() - 1; i++) {
                 innerList.add(container.get(row).get(i) + container.get(row).get(i+1));
             }
             //add the last 1 to the list
             innerList.add(1);
             //add inner list to the container list
             container.add(innerList);
         }
         return container;
    }
}
