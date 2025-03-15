package divideandconquer;

import java.util.Random;

/*
* uses the concept of partition of array into 2 sorted halves based on a pivot element
* */
public class RandomizedQuickSort {

    public static void main(String[] args) {
        int[] arr = {7,5,3,4,1};
        quick(arr, 0, arr.length-1);
    }


    public static void quick(int[] arr, int si, int ei) {
        if(si>=ei) {
            return;
        }
        int idx =  partition(arr,si,ei);
        quick(arr, si, idx-1);
        quick(arr,idx+1,ei);

    }

    /*
     * Right now the code is done as per last element of array.
     * we will generalize it for any other item from any index
     * by swapping any index item from the last item in array and then using the same logic below
     * */
    public static int partition(int[] arr, int si, int ei) {
        //random index swapping needed for random

        Random rn = new Random();
        int ii= rn.nextInt(ei-si)+si;
        int t =arr[ei];
        arr[ei]=arr[ii];
        arr[ii]=t;
        int item = arr[ei];// sahi krna hai


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
}
