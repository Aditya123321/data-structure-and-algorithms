package practice.java.arrays;

import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        //right now, list will have the adderess of the empty array list created in heap memory

        System.out.println(list.size());
        //adding elements into array list
        list.add(1);
        list.add(2);
        list.add(3);

        //add to a particular index
        list.add(1,4);
        System.out.println(list);

        //get values
        System.out.println(list.get(2));
        System.out.println(list);

        //remove values
        System.out.println(list.remove(2));
        System.out.println(list);

        //update values
        System.out.println(list.set(1,-2));
        System.out.println(list);

        //display values
        //using for each loop
        //for loop reads value and not the index
        for(int item  : list) {
            System.out.println(item);
        }
    }
}
