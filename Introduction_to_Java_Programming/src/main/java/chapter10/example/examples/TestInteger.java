/*
 * 10.7 Processing Primitive Data Type Values as Objects
 */
package chapter10.example.examples;

/**
 * Exercise the built in Integer class.
 */
public class TestInteger {
    public static void constructorExamples() {
        //Integer x1 = new Integer("32"); // Deprecated in JDK 9, use .valueOf(i) instesd
        //Integer x2 = new Integer("32");
        Integer x1 = Integer.valueOf("32");
        Integer x2 = Integer.valueOf("32");
        Integer x3 = Integer.valueOf("32");
        Integer x4 = Integer.valueOf("32");
        Integer x5 = 32;
        System.out.println("x1 == x2 is " + (x1 == x2)); // Display false
        System.out.println("x1 == x3 is " + (x1 == x3)); // Display false
        System.out.println("x3 == x4 is " + (x3 == x4)); // Display true
        System.out.println("x3 == x5 is " + (x3 == x5)); // Display true
    }

    public static void frequentlyUsed() {
        Integer x1 = Integer.valueOf("128");
        Integer x2 = Integer.valueOf("128");
        System.out.println("x1 == x2 is " + (x1 == x2)); // Display false
    }

    /** constants */
    public static void maxValues() {
        System.out.println("The maximum integer is " + Integer.MAX_VALUE);
        System.out.println("The minimum positive float is " +Float.MIN_VALUE);
        System.out.println("The maximum double-precision floating-point number is " +
                        Double.MAX_VALUE);
    }

    public static void conversionMethods() {
        int val1 = Double.valueOf(12.4).intValue(); // returns 12
        double val2 = Integer.valueOf(12).doubleValue(); // returns 12.0
        System.out.println("Values = "  + val1 + ", " + val2);
    }

    public static void compareToTest() {
        System.out.println(Double.valueOf(12.4).compareTo(Double.valueOf(12.3)));  // returns 1;
        System.out.println(Double.valueOf(12.3).compareTo(Double.valueOf(12.3)));  // returns 0;
        System.out.println(Double.valueOf(12.3).compareTo(Double.valueOf(12.51))); // returns –1;
    }

    public static void parsing() {
        int i1 = Integer.parseInt("11", 2); // returns 3;
        int i2 = Integer.parseInt("12", 8); // returns 10;
        int i3 = Integer.parseInt("13", 10); // returns 13;
        int i4 = Integer.parseInt("1A", 16); //  returns 26;
        System.out.println("integers = " + i1 + ", " + i2 + ", " + i3 + ", " + i4);
    }

    public static void main(String[] args) {
        constructorExamples();
        frequentlyUsed();
        maxValues();
        conversionMethods();
        parsing();
        compareToTest();
    }
}
