package practice.java.arrays.twodimensional;

public class SpiralPrint {

    public static void main(String[] args) {

        int[][] arr = {
                {1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}
        };


        int rowMin =  0;
        int rowMax = arr.length-1;
        int colMin = 0;
        int colMax = arr[0].length-1;
        int noOfElements = rowMax * colMax;
        int count = 0;

        //following logic is for square matrix only
        while(count<noOfElements) {
            for (int i = colMin; i <= colMax; i++) {
                System.out.println(arr[rowMin][i]);
                count ++;
            }
            rowMin++;
            for (int j = rowMin; j <= rowMax; j++) {
                System.out.println(arr[rowMin][colMax]);
                count++;
            }
            colMax--;
            for (int j = colMax; j >= colMin; j--) {
                System.out.println(arr[rowMax][j]);
                count ++;
            }
            rowMax--;
            for (int j = rowMax; j >= rowMin; j--) {
                System.out.println(arr[j][colMin]);
                count++;
            }
            colMin++;
        }


        //following logic is for any matrix
        while(count<noOfElements) {
            for (int i = colMin; i <= colMax && count<noOfElements; i++) {
                System.out.println(arr[rowMin][i]);
                count ++;
            }
            rowMin++;
            for (int j = rowMin; j <= rowMax  && count<noOfElements; j++) {
                System.out.println(arr[rowMin][colMax]);
                count++;
            }
            colMax--;
            for (int j = colMax; j >= colMin  && count<noOfElements; j--) {
                System.out.println(arr[rowMax][j]);
                count ++;
            }
            rowMax--;
            for (int j = rowMax; j >= rowMin && count<noOfElements; j--) {
                System.out.println(arr[j][colMin]);
                count++;
            }
            colMin++;
        }


    }
}
