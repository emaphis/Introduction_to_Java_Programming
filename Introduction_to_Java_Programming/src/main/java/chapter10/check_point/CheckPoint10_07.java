/*
 * Check Point 10.7
 * Processing Primitive Data Type Values as Objects
 */
package chapter10.check_point;

// 10.7.1  Describe primitive-type wrapper classes.
// a. They wrap primative values to give them the behavour of regular classes
public class CheckPoint10_07 {

    // 10.7.2  Can each of the following statements be compiled?
    static void testWrapperClasses() {
        // a.  ok, but depricated
        Integer h = new Integer("23");

        // b.  ok, but depricated
        Integer i = new Integer(23);

        // c.  ok
        Integer j = Integer.valueOf("23");

        // d.  ok
        Integer k = Integer.parseInt("23", 8);

        // e.  Bad, must have a paremeter
        // Double d = new Double();
        // f.  ok
        Double e = Double.valueOf("23.45");

        // g.  ok
        int l = (Integer.valueOf("23")).intValue();

        // h.  ok
        double f = (Double.valueOf("23.4")).doubleValue();

        // i.  ok
        int m = (Double.valueOf("23.4")).intValue();

        // j.  ok
        String s = (Double.valueOf("23.4")).toString();
    }


    // 10.7.3 How do you convert an integer into a string? How do you convert a numeric string
    //        into an integer? How do you convert a double number into a string? How do you
    //        convert a numeric string into a double value?
    // a.  Add them to a blank string   "" + 5;
    //     Same  "" + 3.4;
    //     Use one of the ParseX() methods.


    // 10.7.4 Show the output of the following code:
    // a.
    //  3
    //  -1
    static void ex10_7_4() {
        Integer x = Integer.valueOf(3);
        System.out.println(x.intValue());
        System.out.println(x.compareTo(4));
    }

    // 10.7.5 What is the output of the following code?
    static void ex10_7_5() {
        System.out.println(Integer.parseInt("10"));
        System.out.println(Integer.parseInt("10", 10));
        System.out.println(Integer.parseInt("10", 16));
        System.out.println(Integer.parseInt("11"));
        System.out.println(Integer.parseInt("11", 10));
        System.out.println(Integer.parseInt("11", 16));
    }


    public static void main(String[] args) {
        ex10_7_4();
        ex10_7_5();
    }
}
