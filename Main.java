//********JAVA GROUP PROJECT*******

//Main runfile of the project

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Database of Account Holders----
        int balance[] = { 6000, 10000, 50000, 38000, 85000 };
        int account[] = { 225001, 225002, 225003, 225004, 225005 };
        int pin[] = { 5664, 8465, 5848, 4895, 5483 };

        // Key to store index of the account for accessing pin and balance
        int key = 0;

        // Taking account number as input
        System.out.println("Enter your 6 digit account number: ");
        int ac = sc.nextInt();

        // Checking if account number is present in the database
        key = BankUtility.isAccountValid(account, ac);
        if (key == -1) {
            System.exit(0);
        }

        System.out.println( "Choose 1 for Withdraw\nChoose 2 for Deposit\nChoose 3 for Check Balance\nChoose 4 for Change Pin\nChoose 5 for EXIT");
        System.out.println("Choose the operation you want to perform: ");
        int option = sc.nextInt();



        if (option == 1) {
            WithDrawMoney withDrawMoney = new WithDrawMoney();
            try {
                int currentBalance = withDrawMoney.withdrawMoneyFromBalance(key, pin[key], balance[key]);
                if (currentBalance == -1) {
                    System.exit(0);
                } else {
                    balance[key] = currentBalance;
                    System.exit(0);
                }
            } catch (Exception ex) {
                System.out.println("Exception occurred while withdrawing money");
                System.exit(0);
            }
        }



        if (option == 2) {
            DepositMoney depositMoney = new DepositMoney();
            try {
                int deposit = depositMoney.AddMoneyToBalance(balance[key]);
                balance[key] = deposit;
            } catch (Exception ex) {
                System.out.println("Error occured while deposit");
                System.exit(0);
            }
            System.exit(0);
        }


        if (option == 3) {
            BankUtility.getBalance(pin[key], balance[key]);
        }

        
        if (option == 4) {
            Boolean ischanged = BankUtility.pinChange(pin[key]);
        }

        if (option == 5) {
            System.out.println("Exiting ATM.....");
            System.exit(0);
        }

    }
}
