package divideandconquer;

import java.util.Random;

public class RandomNumber {

    public static void main(String[] args) {
        int lo = 10;
        int hi =100;
        Random rn = new Random();
        for(int x =0; x<10;x++) {
            //setting the boundary from 10-100 by setting bound in number
            int v = rn.nextInt(hi-lo)+lo;
            System.out.println(v);
        }

    }
}
