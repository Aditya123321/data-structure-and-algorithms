package practice.java.arrays.twodimensional;

import java.util.Scanner;

public class TwoD {

    public static void main(String[] args) {
        //hardcoding 2D array
        int [][] hardCodedArray = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15}
        };

        int [][] hardCodedSquareArray = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        //taking input in array
        /*Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();//row
        int m = scan.nextInt();//col
        int[][] arr = new int[n][m];

        //take iput for 2D array
        for(int i=0; i<arr.length;i++) {
            for(int j=0; j<arr[0].length;j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        //display 2D array
        display(arr);*/

        //display
        printArrayInWaveFormat(hardCodedArray);

        //display transposed array
        transposeOfArray(hardCodedSquareArray);

    }

    public static void display(int[][] arr) {
        for(int i=0; i<arr.length;i++) {
            for(int j=0; j<arr[0].length;j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println( "");
        }
    }

    public static void printArrayInWaveFormat(int[][] arr) {
        for(int i=0; i<arr[0].length;i++) {
            if(i %2 == 0) {
                for(int j=0; j<arr.length;j++) {
                    System.out.print(arr[j][i] + " ");
                }
            } else {
                for(int j=arr.length-1; j>=0;j--) {
                    System.out.print(arr[j][i] + " ");
                }
            }
            System.out.println( "");
        }
    }

    public static void transposeOfArray(int[][] arr) {
        for(int i=0; i<arr.length;i++) {
             for(int j=i+1; j<arr[0].length;j++) {
                 int temp = arr[i][j];
                 arr[i][j] = arr[j][i];
                 arr[j][i] = temp;
                }
        }

        for(int i=0; i<arr.length;i++) {
            for(int j=0; j<arr[0].length;j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println( "");
        }
    }
}
