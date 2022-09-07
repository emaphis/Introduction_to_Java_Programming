/*
 * Listing 12.12
 * 12.10 The File Class
 */
package chapter12.example.listing12_12;

/**
 *
 * @author emaph
 */
public class TestFileClass {

    public static void main(String[] args) {
        java.io.File file = new java.io.File("resource/image/us.gif");
        System.out.println("Does it exist? " + file.exists());
        System.out.println("The file has " + file.length() + " bytes");
        System.out.println("Can it be read? " + file.canRead());
        System.out.println("Can it be written? " + file.canWrite());
        System.out.println("Is it a directory? " + file.isDirectory());
        System.out.println("Is it a file? " + file.isFile());
        System.out.println("Is it absolute? " + file.isAbsolute());
        System.out.println("Is it hidden? " + file.isHidden());
        System.out.println("Absolute path is " + file.getAbsolutePath());
        System.out.println("Last modified on " + new java.util.Date(file.lastModified()));
    }
}

/*
Does it exist? true
The file has 2998 bytes
Can it be read? true
Can it be written? true
Is it a directory? false
Is it a file? true
Is it absolute? false
Is it hidden? false
Absolute path is C:\\src\\NetBeans12\\Introduction_to_Java_Programming\\Introduction_to_Java_Programming\\resource\\image\\us.gif
Last modified on Tue Nov 02 08:20:46 EST 2004
*/
