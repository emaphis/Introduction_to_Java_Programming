/*
 * Listing 12.18
 * 12.13 Case Study: Web Crawler
 */
package chapter12.example.listing12_18;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Web Crawler
 * @author emaph
 */
public class WebCrawler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a URL: ");
        String url = input.nextLine();
        crawler(url);  // Traverse the Web from the starting url
    }

    public static void crawler(String startingURL) {
        ArrayList<String> listOfPendingURLs = new ArrayList<>();
        ArrayList<String> listOfTraversedURLs = new ArrayList<>();

        listOfPendingURLs.add(startingURL);
        while (!listOfPendingURLs.isEmpty() && listOfTraversedURLs.size() <= 100) {
            String urlString = listOfPendingURLs.remove(0);
            if (!listOfTraversedURLs.contains(urlString)) {
                listOfTraversedURLs.add(urlString);
                System.out.println("Crawl " + urlString);

                for (String s : getSubURLs(urlString)) {
                    if (!listOfTraversedURLs.contains(s))
                        listOfPendingURLs.add(s);
                }
            }
        }
    }

    public static ArrayList<String> getSubURLs(String urlString) {
        ArrayList<String> list = new ArrayList<>();

        try {
            java.net.URL url = new java.net.URL(urlString);
            Scanner input = new Scanner(url.openStream());
            int current = 0;
            while (input.hasNext()) {
                String line = input.nextLine();
                current = line.indexOf("https:", current);
                while (current > 0) {
                    int endIndex = line.indexOf("\"", current);
                    if (endIndex > 0) {  // Ensure that a correct URL is found
                        list.add(line.substring(current, endIndex));
                        current = line.indexOf("https:", endIndex);
                    }
                    else
                        current = -1;
                }
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return list;
    }
}

/*
Enter a URL: https://media.pearsoncmg.com/ph/esm/ecs_liang_ijp_12/cw/
Crawl https://media.pearsoncmg.com/ph/esm/ecs_liang_ijp_12/cw/
Crawl https://fonts.googleapis.com/css?family=Open+Sans:400,300,600
Crawl https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css
 ....
*/
