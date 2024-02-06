/*
 * Quick text block example
 */
package main;

/**
 *
 * @author emaph
 */
public class TextBlock {
    public static void main(String[] args) {
        String textBlockJson =
                """
                {
                  "firstName": "%s",
                  "lastName": "%s",
                  "city": "%s:,
                  "phone": %d
                }""";

        String formatedTextBlockJson = textBlockJson.formatted(
                "Nikita",
                "A",
                "Seattle",
                123);
        System.out.println(formatedTextBlockJson);
    }
}
