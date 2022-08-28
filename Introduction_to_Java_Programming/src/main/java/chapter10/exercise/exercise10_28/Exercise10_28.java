package chapter10.exercise.exercise10_28;

/*
 * Exercise 10.28
 *  (Implement the StringBuilder class) The StringBuilder class is provided
 *  in the Java library. Provide your own implementation for the following methods
 *  (name the new class MyStringBuilder2):
 *
 *  public MyStringBuilder2();
 *  public MyStringBuilder2(char[] chars);
 *  public MyStringBuilder2(String s);
 *  public MyStringBuilder2 insert(int offset, MyStringBuilder2 s);
 *  public MyStringBuilder2 reverse();
 *  public MyStringBuilder2 substring(int begin);
 *  public MyStringBuilder2 toUpperCase();
 */

/**
 * Exercise the MyStringBuilder2 class
 * @author emaph
 */
public class Exercise10_28 {
    public static void main(String[] args) {
        // test default constructor and insert at beginning
        MyStringBuilder2 builder1 = new MyStringBuilder2();
        testPrint(builder1);
        MyStringBuilder2 builder2 = new MyStringBuilder2("Hello world!");
        testPrint(builder2);
        testPrint(builder1.insert(0, builder2));
        MyStringBuilder2 builder3 =
                new MyStringBuilder2(new char[] {'t', 'h', 'i', 's', ' '});
        testPrint(builder1.insert(6, builder3));
        testPrint(builder2.reverse());
        testPrint(builder1.substring(6));
        testPrint(builder1.toUpperCase());
    }

    static void testPrint(MyStringBuilder2 builder) {
        System.out.println(builder.getLength() + " - " + builder);
    }
}
