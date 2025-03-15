package practice.java.backtracking;

public class PallindromicSubstring {
public static void main(String[] args) {
    String str = "naan";
    System.out.println(countPallindrome(str));
    }

    public static int countPallindrome(String str) {
        int odd = 0;
        //count odd length of pallindromic substring
        for(int axis = 0; axis<str.length(); axis++) {
            for(int orbit =0 ; axis-orbit >=0 && axis+orbit <str.length(); orbit++) {
                if(str.charAt(axis-orbit) != str.charAt(axis+orbit)) {
                    break;
                }
                odd++;
            }
        }

        int even = 0;
        //count even length of pallindromic substring
        for(double axis = 0.5; axis<str.length(); axis++) {
            for(double orbit =0.5 ; axis-orbit >=0 && axis+orbit <str.length(); orbit++) {
                if(str.charAt((int)(axis-orbit)) != str.charAt((int)(axis+orbit))) {
                    break;
                }
                even++;
            }
        }

        return odd +even;
    }
}
