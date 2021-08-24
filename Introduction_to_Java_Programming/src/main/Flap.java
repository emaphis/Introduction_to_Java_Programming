
// Program to run experiments

package main;

public class Flap {

    static private void example() {
        for (int i = 0; i < 1000; i++) {
            int j = (int) (Math.random() * 8);
            if (i % 40 == 0)
                System.out.println(j);
            else
                System.out.print(j + " ");
        }
    }

    public static void main(String[] args) {
        example();
    }
}
