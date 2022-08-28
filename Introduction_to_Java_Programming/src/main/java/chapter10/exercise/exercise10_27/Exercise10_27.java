/*
 * Exercise 10.27
 *  (Implement the StringBuilder class) The StringBuilder class is provided
 *  in the Java library. Provide your own implementation for the following methods
 *  (name the new class MyStringBuilder1):
 *
 *  public MyStringBuilder1(String s);
 *  public MyStringBuilder1 append(MyStringBuilder1 s);
 *  public MyStringBuilder1 append(int i);
 *  public int length();
 *  public char charAt(int index);
 *  public MyStringBuilder1 toLowerCase();
 *  public MyStringBuilder1 substring(int begin, int end);
 *  public String toString();
 *
 * NOTE: this is similar to MyString1 form Exercise 10.22
 */
package chapter10.exercise.exercise10_27;

/**
 *
 * @author emaph
 */
public class Exercise10_27 {
    public static void main(String[] args) {
        // test a long string.
        MyStringBuilder1 big = new MyStringBuilder1("This Is Now A Long String For Testing");
        testPrint(big);

        // test a short string
        MyStringBuilder1 small = new MyStringBuilder1("small ");
        testPrint(small);

        // append big string on small string to test appending reallocation.
        small.append(big);
        testPrint(small);

        // test append and convert to lower case
        testPrint(small.append(new MyStringBuilder1(" made LOWERCASE")).toLowerCase());

        // test substring - extrace 'this'
        MyStringBuilder1 subset = small.substring(6, 10);
        testPrint(subset);

        // test append int
        testPrint(big.append(new MyStringBuilder1(" with an integer : ")).append(12345));
    }


    static void testPrint(MyStringBuilder1 builder) {
        System.out.println(builder.length() + " - " + builder);
    }
}

/*
37 - This Is Now A Long String For Testing
6 - small
43 - small This Is Now A Long String For Testing
58 - small this is now a long string for testing made lowercase
4 - this
61 - This Is Now A Long String For Testing with an integer : 12345
*/
