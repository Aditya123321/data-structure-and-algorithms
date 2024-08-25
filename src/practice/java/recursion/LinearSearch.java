package practice.java.recursion;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {1,3,4,5,7,8,4};
        System.out.println(findIndex(arr,4, 0));
    }

    //tail recursion
    public static Integer findIndex(int[] arr, int item, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (item == arr[index]) {
            return index;
        }
        return findIndex(arr,4,index+1);
    }

}
