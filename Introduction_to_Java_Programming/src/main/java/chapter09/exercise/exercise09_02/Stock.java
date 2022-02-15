/*
 * Exercise 9.2
 * The Stock class.
 */
package chapter09.exercise.exercise09_02;

/**
 * The Stock class
 * @author emaph
 */
public class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    public Stock(String newSymbol, String newName) {
        symbol = newSymbol;
        name = newName;
    }

    /** return the percentage of price change */
    public double getChangePercent() {
        return ((currentPrice - previousClosingPrice) / currentPrice) * 100;
    }

    public void setCurrentPrice(double newCurrentPrice) {
        currentPrice = newCurrentPrice;
    }

    public void setPreviousClosingPrice(double newPreviousClosingPrice) {
        this.previousClosingPrice = newPreviousClosingPrice;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

}
