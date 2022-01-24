/*
 * Check Point 4.3
 * Character Data Type and Operations
 */
package chapter04.check_point;

/**
 *
 * @author emaph
 */
public class CheckPoint04_03 {
    // 4.3.1 Which of the following are correct literals for characters?
    //      '1',       yes
    //      '\u345dE', no
    //      '\u3fFa',  yes
    //      '\b',      yea
    //      '\t'       yes

    // 4.3.2 How do you display the characters \ and "?
    // a.  '\\'    '\"'
    // 4.3.3 Use print statements to find out the ASCII code for ‘1’, ‘A’, ‘B’, ‘a’, and ‘b’.
    //       Use print statements to find out the character for the decimal codes 40, 59, 79, 85,
    //       and 90. Use print statements to find out the character for the hexadecimal code 40,
    //       5A, 71, 72, and 7A.
    // 1: 49, A:65, B:66, a:97, b:98
    // 40:(, 59:;, 79:O, 85:U, 90:Z
    // 0x40:@, 0x5A:Z, 0x71:q, 0x72:r, 0x7A:z
    static void printChars() {
        System.out.println("1: " + (int) '1' + ", A:" + (int) 'A' + ", B:"
                + (int) 'B' + ", a:" + (int) 'a' + ", b:" + (int) 'b');
        System.out.println("40:" + (char) 40 + ", 59:" + (char) 59 + ", 79:"
                + (char) 79 + ", 85:" + (char) 85 + ", 90:" + (char) 90);
        System.out.println("0x40:" + (char) 0x40 + ", 0x5A:" + (char) 0x5A
                + ", 0x71:" + (char) 0x71 + ", 0x72:" + (char) 0x72 + ", 0x7A:"
                + (char) 0x7A);
    }

    // 4.3.4 Evaluate the following:
    // i: 49, j: 100, k: 97, c:Z
    static void expression4() {
        int i = '1';
        int j = '1' + '2' * ('4' - '3') + 'b' / 'a';
        int k = 'a';
        char c = 90;
        System.out.println("i: " + i + ", j: " + j + ", k: " + k + ", c:" + c);
    }

    // 4.3.5 Can the following conversions involving casting be allowed? If so, find the
    //       converted result.
    // 65  1000  1000  a
    static void expression5() {
        char c = 'A';
        int i = (int) c;

        float f = 1000.34f;
        int j = (int) f;

        double d = 1000.34;
        int k = (int) d;

        int l = 97;
        char e = (char) l;

        System.out.println(i + " " + j + " " + k + " " + e);
    }

    // 4.3.6 Show the output of the following program:
    // b
    // c
    // -2
    static void test() {
        char x = 'a';
        char y = 'c';
        System.out.println(++x);
        System.out.println(y++);
        System.out.println(x - y);
    }

    // 4.3.7 Write the code that generates a random lowercase letter.
    //  97 - 122
    static void expression7() {
        char ch = (char) (Math.random() * 26 + 'a');
        System.out.println("ch: " + ch);
    }

    // 4.3.8  Show the output of the following statements:
    static void expression8() {
        System.out.println('a' < 'b');  // true
        System.out.println('a' <= 'A'); // false
        System.out.println('a' > 'b');  // false
        System.out.println('a' >= 'A'); // true
        System.out.println('a' == 'a'); // true
        System.out.println('a' != 'b'); // true
    }


    public static void main(String[] args) {
        expression8();
        //test();
    }
}
