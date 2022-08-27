/*
 * Exercise 10.25
 *  (New string split method) The split method in the String class returns an
 *  array of strings consisting of the substrings split by the delimiters. However, the
 *  delimiters are not returned. Implement the following new method that returns
 *  an array of strings consisting of the substrings split by the matching delimiters,
 *  including the matching delimiters.
 *
 *      public static String[] split(String s, String regex)
 *
 *  For example, split("ab#12#453", "#") returns ab, #, 12, #, and 453 in
 *  an array of String and split("a?b?gf#e", "[?#]") returns a, ?, b, ?, gf,
 *  #, and e in an array of String
 */
package chapter10.exercise.exercise10_25;

/**
 * New string split method
 * @author emaph
 */
public class Exercise10_25 {
    /**Main method */
    public static void main(String[] args) {
        String[] strings = split("This#is a string#for#a#test", " #");
        print(strings);

        String[] strings2 = split("This#is a string#for#a#test", "");
        print(strings2);
    }

    /** print out an array of strings */
    static void print(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + " ");
        }
        System.out.println();
    }

    /** Split a passed string with given string of delimiters */
    public static String[] split(String s, String regex) {
        char[] delimiters =  getDelimiters(regex);
        String[] strings = new String[10];
        StringBuilder builder = new StringBuilder();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char chr = s.charAt(i);
            if (isDelimiter(chr, delimiters)) {
                strings[count] = builder.toString();
                builder = new StringBuilder();
                count++;
            } else {
                builder.append(chr);
            }
            // put last item on list
            strings[count] = builder.toString();
        }
        // trim strings
        String[] output = new String[count + 1];
        System.arraycopy(strings, 0, output, 0, ++count);

        return output;
    }

    /** Get array of delimiters form the passed regex string */
    private static char[] getDelimiters(String regex) {
        char[] delimiters = new char[regex.length()];
        for (int i = 0; i < regex.length(); i++) {
            delimiters[i] = regex.charAt(i);
        }
        return delimiters;
    }

    /** is passed char a delimiter */
    private static boolean isDelimiter(char chr, char[] delimiters) {
        for (int i = 0; i < delimiters.length; i++) {
            if (chr == delimiters[i])
                return true;
        }
        return false;
    }
}
