package practice.java.backtracking;

public class PartitionInArray {

    public static void main(String[] args) {
        int[] arr = { 5, 7, 2, 1, 8, 3, 4 };
        System.out.println(partition(arr, 0, arr.length - 1));
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    /*
    * Right now the code is done as per last element of array.
    * we will generalize it for any other item from any index
    * by swapping the any index item from the last item in array and then using the same logic below
    * */
    public static int partition(int[] arr, int si, int ei) {
        int item = arr[ei];

        int idx = si;
        for(int i = si; i<ei; i++) {
            if(arr[i] < item) {
                int temp = arr[idx];
                arr[idx] = arr[i];
                arr[i] = temp;
                idx++;
            }
        }
        int temp = arr[idx];
        arr[idx] = arr[ei];
        arr[ei] = temp;
        return idx;
    }

    public static void display(int[] arr) {
        for(int i=0;i<arr.length;i++) {
                System.out.print(arr[i] + " ");
        }
    }
}
