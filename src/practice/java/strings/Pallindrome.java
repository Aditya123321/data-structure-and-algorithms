package practice.java.strings;

public class Pallindrome {

    public static void main(String[] args) {

        String s1 = "nitin";
        //printPattern(s1);
        //printPattern2(s1);
        printPattern3(s1);


    }

    // complexity O(n)
    public static boolean isPalllindrome(String s1) {
        int i=0;
        int j=s1.length()-1;
        while(i<j) {
            if(s1.charAt(i)!=s1.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }


    //complexity O(n^2)
    public static void printPattern(String s1) {
        int i = 0;
        while( i < s1.length()) {
            for(int j = 0; j<=i; j++) {
                 System.out.print(s1.substring(j,i+1) + " ") ;
            }
            i++;
            System.out.println();
        }
    }

    //complexity O(n^2)
    public static void printPattern2(String s1) {
        int i = 0;
       for(i=0; i < s1.length(); i++) {
            for(int j = i+1; j<=s1.length(); j++) {
                System.out.println(s1.substring(i,j) + " ") ;
            }
        }
    }

    //complexity O(n^2)
    public static void printPattern3(String s1) {
        int k = 0;
        for(int i = 1; i <= s1.length(); i++) {
            for(int j = i; j<=s1.length(); j++) {
                k = j - i;
                System.out.println(s1.substring(k,j)) ;
            }

            System.out.println("") ;
        }
    }
    
    
}
