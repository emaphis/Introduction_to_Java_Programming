/*
 * Check Point 7.10
 * 7.10 Searching Arrays
 */
package chapter07.check_point;

/**
 * @author emaph
 */
public class CheckPoint07_10 {

    // 7.10.1 If high is a very large integer such as the maximum int value 2147483647,
    //        (low + high) / 2 may cause overflow. How do you fix it to avoid overflow?
    // a. replace with (-low + high) / 2 + lo


    // 7.10.2 Use Figure 7.9 as an example to show how to apply the binary search approach to a
    //        search for key 10 and key 12 in list {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79}.

    // Search for 10
    // 1.  low                   mid                     high
    //      V                     V                       V
    //      2  4  7  10  11  45  50  59  60  66  69  70  79

    // 2.  low       mid         high
    //      V         v           V
    //      2  4  7  10  11  45  50  59  60  66  69  70  79

    // search for 12
    // 1.  low                   mid                     high
    //      V                     V                       V
    //      2  4  7  10  11  45  50  59  60  66  69  70  79

    // 2.  low       mid         high
    //      V         v           V
    //      2  4  7  10  11  45  50  59  60  66  69  70  79

    // 3.            low  mid    high
    //                v   v      V
    //      2  4  7  10  11  45  50  59  60  66  69  70  79

    // 4.                Low mid high
    //                   v    V   V
    //      2  4  7  10  11   45  50  59  60  66  69  70  79
    // not found


    // 7.10.3 If the binary search method returns −4, is the key in the list? Where should the key
    //        be inserted if you wish to insert the key into the list?
    // a. no, the key is not in the list
    //    After the third postion


    public static void main(String[] args) {
        System.out.println("No implementatios");
    }
}
