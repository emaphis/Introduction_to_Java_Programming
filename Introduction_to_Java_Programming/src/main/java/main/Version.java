/*
 * Program that prints out the version, vendor,
 * and envioronment of the project JDK
 */
package main;

import java.util.Properties;

/**
 * Version program
 * @author emaph
 */
public class Version {
    public static void main(String[] args) {
        System.out.println("******************** Hello, JDK ********************");
        Properties prop = System.getProperties();

        String version = prop.getProperty("java.version");
        String vendor = prop.getProperty("java.vendor");
        String date = prop.getProperty("java.version.date");
        System.out.println("Vendor:    " + vendor + " : " + version + " : " + date);

        String vm = prop.getProperty("java.vm.name");
        String vmversion = prop.getProperty("java.vm.version");
        System.out.println("Java VM:   " + vm + " : " + vmversion);

        String home = prop.getProperty("java.home");
        String path = prop.getProperty("user.dir");
        String temp = prop.getProperty("java.io.tmpdir");
        System.out.println("Java home: " + home);
        System.out.println("User dir:  " + path);
        System.out.println("Temp dir:  " + temp);
        System.out.println("****************************************************");
    }
}
