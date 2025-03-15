package divideandconquer;

import java.util.List;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {7,5,3,4,1};
        int[] sortedArr = sort(arr, 0, arr.length-1);
        for( int x : sortedArr) {
            System.out.println(x);
        }
    }

    public static int[] sort(int[] arr, int lo, int hi) {
        if(lo==hi) {
            int[] b = new int[1];
            b[0] = arr[lo];
            return b;
        }
        int mid = (lo+hi)/2;
        int[] fs = sort(arr,lo,mid);
        int[] ss = sort(arr,mid+1,hi);

        return merge(fs,ss);
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        //sizes of arrs
        int n = arr1.length;
        int m = arr2.length;
        int[] ans = new int[n+m];

        int i = 0, j=0, k=0;
        while(i < n && j<m) {
            if (arr1[i] < arr2[j]) {
                ans[k] = arr1[i];
                i++;
                k++;
            } else {
                ans[k] = arr2[j];
                j++;
                k++;
            }
        }

        while(i<n) {
            ans[k] = arr1[i];
            i++;
            k++;
        }

        while(j<m) {
            ans[k] = arr2[j];
            j++;
            k++;
        }

        return ans;
    }
}
