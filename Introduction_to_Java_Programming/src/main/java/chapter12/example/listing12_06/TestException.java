/*
 * Listing 12.6
 * 12.4 Declaring, Throwing, and Catching Exceptions
 */
package chapter12.example.listing12_06;

/**
 * You can use the printStackTrace(), getMessage(), toString(), and
 * getStackTrace() methods to obtain information from exception objects
 *
 * @author emaph
 */
public class TestException {
    public static void main(String[] args) {
        try {
            System.out.println(sum(new int[] {1, 2, 3, 4, 5}));
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("********************************************");
            System.out.println("\n" + ex.getMessage());
            System.out.println("********************************************");
            System.out.println("\n" + ex.toString());

            System.out.println("\nTrace Info Obtained from getStackTrace");
            StackTraceElement[] traceElements = ex.getStackTrace();
            for (int i = 0; i < traceElements.length; i++) {
                System.out.print("method " + traceElements[i].getMethodName());
                System.out.print("(" + traceElements[i].getClassName() + ":");
                System.out.println(traceElements[i].getLineNumber() + ")");
            }
        }
    }

    private static int sum(int[] list) {
        int result = 0;
        for (int i = 0; i <= list.length; i++) {  // cause an exception
            result += list[i];
        }
        return result;
    }
}
