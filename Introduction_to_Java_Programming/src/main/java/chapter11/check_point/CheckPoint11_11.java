/*
 * Check Point 11.11 - The ArrayList Class
 */

package chapter11.check_point;

import java.util.ArrayList;

public class CheckPoint11_11 {

    static void test01() {
    // 11.11.1 How do you do the following?

    // a. Create an ArrayList for storing double values?
        ArrayList<Double> list = new ArrayList<>();

    // b. Append an object to a list?
        list.add(33.0);

    // c. Insert an object at the beginning of a list?
        list.add(0, 22.0);

    // d. Find the number of objects in a list?
        int num = list.size();
        System.out.println("length: " + num + " : " + list);

        // add some data.
        list.add(44.0);
        list.add(55.0);
        list.add(66.0);
        System.out.println(list);

    // e. Remove a given object from a list?
        list.remove(33.0);
        System.out.println("remove 33.0 " + list);

    // f. Remove the last object from a list?
        list.remove(list.size() - 1);
        System.out.println("remove last " + list);

    // g. Check whether a given object is in a list?
        System.out.println("check for 44.0 " + list.contains(44.0));
        System.out.println("check for 66.0 " + list.contains(66.0));

    // h. Retrieve an object at a specified index from a list?
        int idx = 1;
        System.out.println("get second item " + list.get(idx));
    }

    // 11.11.2 Identify the erros in the following code.
    static void test02() {

        ArrayList<String> list = new ArrayList<>();
        list.add("Denver");
        list.add("Austin");

        // list.add(new java.util.Date());  // wrong type

        String city = list.get(0);
        System.out.println("city " + city);

        //list.set(3, "Dallas");
        // java.lang.IndexOutOfBoundsException: Index 3 out of bounds

        // System.out.println(list.get(3));  // out of bounds
    }

    static void test03() {
        // 11.11.3 Suppose the ArrayList list contains {"Dallas", "Dallas", "Hous￾ton", "Dallas"}. What is the list after invoking list.remove("Dallas")
        //          one time?
        // a-  "Dallas", "Houston", "Dallas"
        ArrayList<String> list = new ArrayList<>();
        list.add("Dallas");
        list.add("Dallas");
        list.add("Houston");
        list.add("Dallas");

        list.remove("Dallas");
        System.out.println("remove: " + list);

        //  Does the following code correctly remove all elements with value
        // "Dallas" from the list? If not, correct the code.
        for (int i = 0; i < 2; i++)
            list.remove("Dallas");
        System.out.println("remove: " + list);
    }

    static void test04() {
    // 11.11.4 Explain why the following code displays [1, 3] rather than [2, 3].
    // a- index starts at 0.
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(1);
        System.out.println(list);

    // How do you remove integer value 3 from the list?
        list.remove(Integer.valueOf(3));
    }

    static void test05() {
    // 11.11.5 Explain why the following code is wrong:
    // a- Wrong type.
        ArrayList<Double> list = new ArrayList<>();
        //list.add(1);
    }

    public static void main(String[] args) {
        System.out.println("check point 11.11");
        //test01();
        //test02();
        //test03();
        //test04();
    }
}

