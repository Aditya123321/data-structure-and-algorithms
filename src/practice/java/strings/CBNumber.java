package practice.java.strings;

public class CBNumber {

    public static void main(String[] args) {
    }

    public static int countCbNumber(String s) {
        int count = 0;
        boolean [] visited = new boolean[s.length()];
        for (int len = 1; len <= s.length(); len++) {
            for (int j = len; j <= s.length(); j++) {
                int i = j - len;
               String subString = s.substring(i,j);
               if(isCbNumber(Long.parseLong(subString)) && isVisited(visited, i, j-1)) {
                   count++;
                   //mark indexes as visited if number is cb
                   for(int k = i; i<=j; j++) {
                        if(visited[k]) {
                            visited[k] = true;
                        }
                   }
               }
            }
        }
        return count;
    }

    public static boolean isVisited(boolean[] visited, int i, int j) {
        for(int k = i; i<=j; j++) {
            if(visited[k]) {
                return false;
            }
        }
        return true;
    }
    public static boolean isCbNumber(long num) {
        if(num == 0|| num == 1){
            return false;
        }

        int[] arr = {2,3,5,7,11,13,17,19,23,29};

        for(int i =0 ; i < arr.length; i++) {
            if(num == arr[i]) {
                return true;
            }
        }

        for(int i =0 ; i < arr.length; i++) {
            if(num % arr[i] == 0) {
                return false;
            }
        }

        return true;


    }
}
