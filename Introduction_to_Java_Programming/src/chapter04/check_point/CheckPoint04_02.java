/*
 * Check Point 4.2
 * Common Mathematical Functions
 */
package chapter04.check_point;

/**
 *
 * @author emaph
 */
public class CheckPoint04_02 {

    // 4.2.1 Evaluate the following method calls:
    static void expressions1() {
        System.out.println("a: " + Math.sqrt(4));     // 2.0
        System.out.println("b: " + Math.sin(2 * Math.PI)); // -2.4492935982947064E-16
        System.out.println("c: " + Math.cos(2 * Math.PI)); // 1.0
        System.out.println("d: " + Math.pow(2, 2));    // 4.0
        System.out.println("e: " + Math.log(Math.E));  // 1.0
        System.out.println("f: " + Math.exp(1));       // 2.718281828459045
        System.out.println("g: " + Math.max(2, Math.min(3, 4))); // 3

        System.out.println("h: " + Math.rint(-2.5));   // -2.0
        System.out.println("i: " + Math.ceil(-2.5));   // -3.0
        System.out.println("j: " + Math.floor(-2.5));  // -3.0
        System.out.println("k: " + Math.round(-2.5f)); // -2
        System.out.println("l: " + Math.round(-2.5));  // -2

        System.out.println("m: " + Math.rint(2.5));    // 2.0
        System.out.println("n: " + Math.ceil(2.5));    // 3.0
        System.out.println("o: " + Math.floor(2.5));   // 2.0
        System.out.println("p: " + Math.round(2.5f));  // 3
        System.out.println("q: " + Math.round(2.5));   // 3
        System.out.println("r: " + Math.round(Math.abs(-2.5))); // 3
    }

    // 4.2.2 True or false? The argument for trigonometric methods is an angle in radians.
    // a. true

    // 4.2.3 Write a statement that converts 47 degrees to radians and assigns the result to a variable.
    static void vars3() {
        double deg = Math.toRadians(47);
        System.out.println("deg: " + deg);  // 0.8203047484373349
    }

    // 4.2.4 Write a statement that converts PI / 7 to an angle in degrees and assigns the result
    //       to a variable.
    static void vars4() {
        double deg = Math.toRadians( Math.PI / 7);
        System.out.println("deg: " + deg);  // 0.007833019365943935
    }

    // 4.2.5 Write an expression that obtains a random integer between 34 and 55. Write an ex-
    //       pression that obtains a random integer between 0 and 999. Write an expression that
    //       obtains a random number between 5.5 and 55.5.
    static void expressions5() {
        int rnd1 = ((int) (Math.random() * 21)) + 34;
        int rnd2 = ((int) (Math.random() * 999));
        System.out.println(rnd1 + " " + rnd2);
    }

    // 4.2.6 Why does the Math class not need to be imported?
    // a. It's inported by default in  the JVM

    // 4.2.7 What is Math.log(Math.exp(5.5))?           // 5.5
    //       What is Math.exp(Math.log(5.5))?           // 5.5
    //       What is Math.asin(Math.sin(Math.PI / 6))?  // 0.5235987755982988
    //       What is Math.sin(Math.asin(Math.PI / 6))?  // 0.5235987755982988
    static void expressions7() {
        System.out.println(Math.log(Math.exp(5.5)));
        System.out.println(Math.exp(Math.log(5.5)));
        System.out.println(Math.asin(Math.sin(Math.PI / 6)));
        System.out.println(Math.sin(Math.asin(Math.PI / 6)));
    }

    // program to run examples
    public static void main(String[] args) {
        expressions7();
        //vars4();
    }
}
