//********JAVA GROUP PROJECT*******

import java.util.Scanner;

public class BankUtility {
    public static int isAccountValid(int [] account, int inputAccountNumber) {
        Boolean acheck = false;
        int key = -1;

        for (int i = 0; i < 5; i++){
            if (inputAccountNumber==account[i]) {
                acheck=true;
                key=i;
                break;
            } 
           }
     
           if (acheck==false) {
             System.out.println("Account Number not registered.\nPlease try again.");
             return -1;
           }

           return key;
    }

    public static Boolean pinChange(int originalPin){
        Boolean pcheck = false;
        int falsepin =0;
        Scanner sc = new Scanner(System.in);

        while(!pcheck){

            if (falsepin==3) {
                System.out.println("Incorrect pin entered three times.Please try again after 24 hours.");
                System.exit(0);
            }
        System.out.print("Enter your 4 digit pin: ");
        int pin1= sc.nextInt();
        if(pin1!=originalPin){
         falsepin++;
         System.out.println("Incorrect pin.");
        }
        else{
        pcheck=true;
        System.out.println("Enter new 4 digit pin.");
        int newpin= sc.nextInt();
        originalPin=newpin;
        System.out.println("New pin set successfully.");
         return true;
        }
        
     }
     return false;
    }

    public static void getBalance(int pinId, int currentBalance){
        Boolean pcheck = false;
        int falsepin =0;
   
        while(!pcheck){

            if (falsepin==3) {
                System.out.println("Incorrect pin entered three times.Please try again after 24 hours.");
                System.exit(0);
            }
        System.out.print("Enter your 4 digit pin: ");
        Scanner sc = new Scanner(System.in);
        int pin1= sc.nextInt();
        if(pin1!= pinId){
         falsepin++;
         System.out.println("Incorrect pin.");
        }
        else{
        pcheck=true;
        System.out.println("Balance : "+currentBalance);
        System.exit(0);
        }
        }


       // return currentBalance;
    }
}
