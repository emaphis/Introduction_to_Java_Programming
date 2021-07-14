/*
 *  Check Point 3.6
 */
package chapter03.check_point;

/**
 * Common Errors and Pitfalls
 * @author emaph
 */
public class CheckPoint03_06 {
    // .6.1 Which of the following statements are equivalent? Which ones are correctly indented?

    static void a() {
        int i = 0;
        int j = 0;
        int k = 0;
        int x = 0;
        int y = 0;
        int z = 0;
        
        if (i > 0) if
        (j > 0)
        x = 0; else
       if (k > 0) y = 0;
       else z = 0;
    }

    public static void main(String[] args) {

    }
}
