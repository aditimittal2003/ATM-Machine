//********JAVA GROUP PROJECT*******

import java.util.Scanner;

public class DepositMoney {
    public DepositMoney() {

    }

    public int AddMoneyToBalance(int currentBalance) throws Exception{
        System.out.print("Enter money to be deposited:");
        Scanner sc = new Scanner(System.in);
        int deposit = sc.nextInt();

        if (deposit>50000) {
            System.out.println("Cannot deposit more than Rs 50,000 at a time. Please try again.");
            throw new Exception();
        }

        currentBalance = currentBalance + deposit;  
        System.out.println("Your Money has been successfully depsited");
        System.out.println("Balance : "+currentBalance);
        return currentBalance;
    }

} 
