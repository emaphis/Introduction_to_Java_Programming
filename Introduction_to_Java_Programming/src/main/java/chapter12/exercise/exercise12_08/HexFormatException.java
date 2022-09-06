/*
 * Exericse 12.8
 * Implement the HexFormatException class
 */
package chapter12.exercise.exercise12_08;

/**
 * Invalid hes string exception.
 * @author emaph
 */
public class HexFormatException extends Exception {
    private String hex;

    public HexFormatException() {
    }

    public HexFormatException(String hex) {
        super("Invalid hex string " + hex);
        this.hex = hex;
    }

    /** return hex string */
    public String getHex() {
        return hex;
    }
}
