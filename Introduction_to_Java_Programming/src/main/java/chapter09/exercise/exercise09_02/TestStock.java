/*
 * Exercise 9.2
 *  (The Stock class) Following the example of the Circle class in Section 9.2,
 *  design a class named Stock that contains:
 *
 *  ■ A string data field named symbol for the stock’s symbol.
 *  ■ A string data field named name for the stock’s name.
 *  ■ A double data field named previousClosingPrice that stores the stock
 *    price for the previous day.
 *  ■ A double data field named currentPrice that stores the stock price for the
 *    current time.
 *  ■ A constructor that creates a stock with the specified symbol and name.
 *  ■ A method named getChangePercent() that returns the percentage changed
 *    from previousClosingPrice to currentPrice.
 a8
 *  Draw the UML diagram for the class then implement the class. Write a test pro-
 *  gram that creates a Stock object with the stock symbol ORCL, the name Oracle
 *  Corporation, and the previous closing price of 34.5. Set a new current price to
 *  34.35 and display the price-change percentage.
 */
package chapter09.exercise.exercise09_02;

/**
 * Exercise the Stock class.
 * @author emaph
 */
public class TestStock {
    public static void main(String[] args) {
        Stock stock = new Stock("SUNW", "Sun MicroSystems Inc.");
        stock.previousClosingPrice = 100;
        stock.currentPrice = 90;

        double change = stock.getChangePercent();
        // Display stock info
        System.out.println("Previous Closing Price: " +
          stock.previousClosingPrice);
        System.out.println("Current Price: " +
          stock.currentPrice);
        System.out.println("Price Change: " +
         (change * 100) + "%");
    }
}

/*
Percent change of stock price for: ORCL - Oracle Corporation is -0.44
*/
