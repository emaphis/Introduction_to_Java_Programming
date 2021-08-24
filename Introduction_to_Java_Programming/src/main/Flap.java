
// Program to run experiments

package main;

public class Flap {

    static private void example() {
        long l = 0;
        long r = 0;
        for (long i = 0; i < 1000_000; i++) {
            if (bounce() == 1)
                r++;
            else
                l++;
        }
        System.out.println("left " + l + ", right " + r);
    }


   private static int bounce() {
       if (Math.random() > 0.5)
           return 1;
       else
           return -1;
   }

    public static void main(String[] args) {
        example();
    }
}
