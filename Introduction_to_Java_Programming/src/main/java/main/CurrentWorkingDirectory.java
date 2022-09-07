/*
 * Chapter 12
 * Find the current working directory as a utility.
 */
package main;

/**
 * Find the current working directory
 * @author emaph
 */
public class CurrentWorkingDirectory {
    public static void main(String[] args) {
        String workingDir = System.getProperty("user.dir");
        System.out.println("Current working dir = " + workingDir);
    }
}
