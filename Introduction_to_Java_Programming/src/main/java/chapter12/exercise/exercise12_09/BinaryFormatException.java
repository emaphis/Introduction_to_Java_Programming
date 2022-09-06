/*
 * Exericse 12.9
 * Implement the BinaryFormatException class
 */
package chapter12.exercise.exercise12_09;

/**
 * Invalid binary string exception.
 * @author emaph
 */
public class BinaryFormatException extends Exception {
    private String binary;

    public BinaryFormatException() {
    }

    public BinaryFormatException(String binary) {
        super("Invalid binary string " + binary);
        this.binary = binary;
    }

    /** return binary string */
    public String getBinary() {
        return binary;
    }
}
