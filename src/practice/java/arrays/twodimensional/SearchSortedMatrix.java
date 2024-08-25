package practice.java.arrays.twodimensional;

public class SearchSortedMatrix {

    public static void main(String[] args) {

        int[][] arr = {
                {1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}
        };

        int item = 5;
        int row =  0;
        int col = arr[0].length-1;
       while(row < arr.length && col >=0) {
            if(arr[row][col] == item) {
                System.out.println(" Present");
                break;
            } else if(arr[row][col] > item) {
                //element must be in previous column
                col--;
            } else if(arr[row][col] < item) {
                //element must be in next row
                row++;
            } else {
                System.out.println("Not Present");
            }
            //time complexity of above code is O(n)
        }
    }
}
