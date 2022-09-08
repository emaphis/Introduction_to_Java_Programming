/*
 * Listing 12.17
 * 12.12 Reading Data from the Web
 */
package chapter12.example.listing12_17;

import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class ReadFileFromURL {
    public static void main(String[] args) {
        System.out.print("Enter a URL: ");
        String URLString = new Scanner(System.in).next();

        try {
            java.net.URL url = new java.net.URL(URLString);
            int count = 0;
            Scanner input = new Scanner(url.openStream());
            while (input.hasNext()) {
                String line = input.nextLine();
                count += line.length();
            }

            System.out.println("The file size is " + count + " characters");
        }
        catch (java.net.MalformedURLException ex) {
            System.out.println("Invalid URL");
        }
        catch (Exception e) {
            System.out.println("IO Errors: no such file");
        }
    }
}

/*
Enter a URL: https://liveexample.pearsoncmg.com/data/Lincoln.txt
The file size is 1469 characters

Enter a URL:  https://www.yahoo.com
The file size is 143308 characters

Enter a URL: https://dipsydoo.com/
IO Errors: no such file
*/