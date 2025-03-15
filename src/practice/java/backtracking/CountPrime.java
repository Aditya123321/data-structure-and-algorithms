package practice.java.backtracking;

public class CountPrime {

    public static void main(String[] args) {
        int n =687;

        System.out.println(isPrime(n));
        System.out.println(isPrimeSieve(100));

    }

    public static boolean isPrime(int n) {
        int div = 2;
        while(div*div <=n) {
            if(n%div ==0) {
                return false;
            }
            div++;
        }
        return true;
    }

    public static int isPrimeSieve(int n) {
        int [] prime = new int[n+1];
        prime[0] = 1;// not prime
        prime[1] = 1;// not prime
        for(int i =2; i*i<prime.length; i++) {
            if(prime[i]==0) {// these are prime numbers
                for(int j=2; i*j<prime.length; j++) {
                    prime[i*j] = 1;
                }
            }
        }
        int c =0;
        for(int i =2; i*i<prime.length; i++) {
            c++;
        }
        return c;
    }

}
