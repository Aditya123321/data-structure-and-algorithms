package practice.java.strings;

public class Compare {

    public static void main(String[] args) {

        String s1 = "kunal";
        String s2 = "komal";


        //java's String's compareTo() gives the difference of the characters of the two string which are different
        // is its positive s1> s2 else s1< s2
        // it compares the ascii values
        //lexographical order which is alphabet wise comparision


       int len1 = s1.length();
       int len2 = s2.length();

       if(len2 == len1) {

       }
    }

    // complexity O(n)
    public static int compareTo(String s1, String s2) {
        //use case 1 : address is same
        if(s1==s2) {
            return 0;
        }

        //if length is different
        int len = Math.min(s1.length(), s2.length());

        for(int i=0; i< len; i++) {
            if(s1.charAt(i)!=s2.charAt(i)) {
                return (s1.charAt(i) - s2.charAt(i));
            }
        }

        //use case if s1 or s2 is a substring of each other
        // in that case we return the difference of length
        return s1.length() - s2.length();
    }
}
