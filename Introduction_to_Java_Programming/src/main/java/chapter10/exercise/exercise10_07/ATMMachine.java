/*
 * Exercise 10.7
 *  (Game: ATM machine) Use the Account class created in Programming Exer-
 *  cise 9.7 to simulate an ATM machine. Create 10 accounts in an array with id
 *  0, 1, . . . , 9, and an initial balance of $100. The system prompts the user to
 *  enter an id. If the id is entered incorrectly, ask the user to enter a correct id.
 *  Once an id is accepted, the main menu is displayed as shown in the sample
 *  run. You can enter choice 1 for viewing the current balance, 2 for withdraw-
 *  ing money, 3 for depositing money, and 4 for exiting the main menu. Once
 *  you exit, the system will prompt for an id again. Thus, once the system starts,
 *  it will not stop
 */
package chapter10.exercise.exercise10_07;

import chapter09.exercise.exercise09_07.Account;
import java.util.Scanner;

/**
 * ATM machine
 * @author emaph
 */
public class ATMMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account[] accounts = initializeAccounts(10, 100.0);

        while (true) {
            System.out.print("\nEnter an id: ");
            int id = input.nextInt();
            if (id < 0 || id > 9)
                System.out.println("Please enter a correct account id ");
            else
                runAccount(accounts, id, input);
        }
    }

    static Account[] initializeAccounts(int num, double balance) {
        Account[] accounts = new Account[10];
        for (int i = 0; i < num; i++) {
            accounts[i] = new Account(i, balance);
        }
        return accounts;
    }

    private static void runAccount(Account[] accounts, int id, Scanner input) {
        boolean exit = false;
        while (!exit) {
            System.out.println();
            System.out.print("Main menu\n" +
                              "1: check balance\n" +
                              "2: withdraw\n" +
                              "3: deposit\n" +
                              "4: exit\n" +
                              "Enter a choice: ");

            int choice = input.nextInt();

            switch (choice) {
                case 1: checkBalance(accounts, id); break;
                case 2: withdraw(accounts, id, input); break;
                case 3: deposit(accounts, id, input); break;
                case 4: exit = true;
            }
        }
    }

    private static void checkBalance(Account[] accounts, int id) {
        double balance = accounts[id].getBalance();
        System.out.printf("The balance is %.2f\n", balance);
    }

    private static void withdraw(Account[] accounts, int id, Scanner input) {
        System.out.print("Enter an amount to withdraw: ");
        double amount = input.nextDouble();
        accounts[id].withdraw(amount);
    }

    private static void deposit(Account[] accounts, int id, Scanner input) {
        System.out.print("Enter an amount to deposit: ");
        double amount = input.nextDouble();
        accounts[id].deposit(amount);
    }

}

/*
// Example run matching the book example:

Enter an id: 4

Main menu
1: check balance
2: withdraw
3: deposit
4: exit
Enter a choice: 1
The balance is 100.00

Main menu
1: check balance
2: withdraw
3: deposit
4: exit
Enter a choice: 2
Enter an amount to withdraw: 3

Main menu
1: check balance
2: withdraw
3: deposit
4: exit
Enter a choice: 1
The balance is 97.00

Main menu
1: check balance
2: withdraw
3: deposit
4: exit
Enter a choice: 3
Enter an amount to deposit: 10

Main menu
1: check balance
2: withdraw
3: deposit
4: exit
Enter a choice: 1
The balance is 107.00

Main menu
1: check balance
2: withdraw
3: deposit
4: exit
Enter a choice: 4

Enter an id:
*/
