/*
 * Listing 12.9
 * 12.8 Chained Exceptions
 * Thrnowing an exception along with another exception forms a chained exception
 */
package chapter12.example.listing12_09;

/**
 * Chained Exceptions
 * @author emaph
 */
public class ChainedExceptionDemo {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void method1() throws Exception {
        try {
            method2();
        } catch (Exception ex) {
            throw new Exception("New info from method1", ex);
            //throw new Exception("New info from method1");  // See Check Point 12.8
        }
    }

    public static void method2() throws Exception {
        throw new Exception("New info from method2");
    }
}

/*
java.lang.Exception: New info from method1
	at chapter12.example.Listing12_09.ChainedExceptionDemo.method1(ChainedExceptionDemo.java:25)
	at chapter12.example.Listing12_09.ChainedExceptionDemo.main(ChainedExceptionDemo.java:15)
Caused by: java.lang.Exception: New info from method2
	at chapter12.example.Listing12_09.ChainedExceptionDemo.method2(ChainedExceptionDemo.java:30)
	at chapter12.example.Listing12_09.ChainedExceptionDemo.method1(ChainedExceptionDemo.java:23)
	... 1 more
*/
