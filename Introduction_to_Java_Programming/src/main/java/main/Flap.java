// Program to run experiments
package main;

import java.util.function.Supplier;

public class Flap {


    public static void main(String[] args) {
        Supplier<String> s = () -> {
            String[] names = {"Derby", "Arya", "Celest", "Mirage"};
            int idx = (int)(Math.random() * names.length);
            System.out.println("idx: " + idx);
            String randomName = names[idx];
            StringBuilder sb = new StringBuilder(randomName);
            return sb.reverse().toString();
        };
        System.out.println(s.get());
    }

}
