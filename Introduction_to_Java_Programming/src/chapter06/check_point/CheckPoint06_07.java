/*
 * Check Point 6.7
 *
 */
package chapter06.check_point;

/**
 * 6.7 Case Study: Converting Hexadecimals to Decimals
 * @author emaph
 */
public class CheckPoint06_07 {
    // 6.7.1  What is hexCharToDecimal('B'))?
    //        What is hexCharToDecimal('7'))?
    //        What is hexToDecimal("A9"))?

    // a. 'B' = 11
    //    '7' = 7
    //    'A9' = 169

    
    public static void main(String[] args) {
        System.out.println("'B' = " + hexToDecimal("B"));
        System.out.println("'7' = " + hexToDecimal("7"));
        System.out.println("'A9' = " + hexToDecimal("A9"));
    }

    public static int hexToDecimal(String hex) {
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }

        return decimalValue;
    }


    private static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F')
                return 10 + ch - 'A';
        else
            return ch - '0';
    }
}
