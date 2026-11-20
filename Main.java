 import java.util.Scanner;
public class Main{
    public static void main (String[]args) {
        System.out.println("Please enter a 4-digit PIN.");
        Scanner scan = new Scanner(System.in);
        boolean islogged = false;
        int i = 1;
        while (i <= 3) {
            int pin = scan.nextInt();
            if (pin == 1234) {
                System.out.println("valid pin");
                islogged = true;
                break;
            } else {
                System.out.println(" invalid pin");
            }
            i++;
        }
        if (islogged == false) {
            System.out.println(" Your account has been locked");
        }

        double balance = 2500.75;
        double updatebalance=0;
        int choice = scan.nextInt();
        do{

        switch (choice) {
//     check balance
            case 1:
                System.out.println("Current Balance: " + balance);
                break;
//  deposit
            case 2:
                System.out.println("Enter deposit amount:");
                double deposit = scan.nextDouble();
                if (deposit > 0) {
                    balance = balance + deposit;
                    System.out.println("update balance=" + balance);
                } else {
                    System.out.println("invalid");
                }
                break;
//      withdraw
            case 3:
                System.out.println("Enter Withdraw amount:");
                double withdrawamount = scan.nextDouble();
                if(withdrawamount>0&& withdrawamount<=balance) {
                    balance = balance - withdrawamount;
                    System.out.println("update balance=" + balance);
                }
                else{
                    System.out.println("Insufficient balance");
                }
                break;
            case 4:
                if(balance>=5000){
                    System.out.println("VIP Customer ");
                }
                else if(balance>=1000&&balance<=4999.99){
                System.out.println("Regular Customer");}
                else{
                    System.out.println("Low Balance");
            }
                break;
            case 5:
                System.out.println("Thank you for using our ATM");
                break;
            default:
                System.out.println("Invalid option");



        }
        } while (choice != 5);
    }
}