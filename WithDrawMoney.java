//********JAVA GROUP PROJECT*******

import java.util.Scanner;

public class WithDrawMoney {
   public WithDrawMoney() {

    }

    public int withdrawMoneyFromBalance(int personID, int pinID,int currentBalance) throws Exception{
        System.out.print("Enter money to be withdrawn:");  
        Scanner sc = new Scanner(System.in);
        int withdraw = sc.nextInt();
        Boolean pcheck = false;
        int falsepin=0;

        while(!pcheck){
 
             if (falsepin==3) {
                 System.out.println("Incorrect pin entered three times.Please try again after 24 hours.");
                 throw new Exception();
             }
         System.out.print("Enter your 4 digit pin: ");
         int pin1= sc.nextInt();
         if(pin1!=pinID){
          falsepin++;
          System.out.println("Incorrect pin.");
         }
         else{
         pcheck=true;
 
         if (withdraw>10000) {
            //Maximum amount that can be taken out at a time is Rs 10,000.
            System.out.println("Entered amount greater than limit.Please try again.");
           return -1;
         }
 
         if (withdraw%100 != 0) {
             System.out.println("Entered amount not a multiple of 100. Please try again.");
            return -1;
         }
 
         if(currentBalance >= withdraw)  
         {    
             currentBalance = currentBalance - withdraw;  
             System.out.println("Please collect your money");
            
         }  
         else {
         System.out.println("Insufficient Balance\n");
         return -1;
         }    
         }          
      }
      System.out.println("Balance : "+currentBalance);

      return currentBalance;
    }
}
