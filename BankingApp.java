import java.util.InputMismatchException;
import java.util.Scanner;

public class BankingApp {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();
        System.out.println("Welcome to Banking App");
        Scanner input = new Scanner(System.in);

        // Controls application execution
        boolean loop = true;


        while(loop){
            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Check Balance");
            System.out.println("4.Exit");
            System.out.println();

            try {

                System.out.print("Enter your choice: ");
                int choice = input.nextInt();

                switch (choice) {
                    // Deposit operation
                    case 1:
                        System.out.println("Enter Amount to Deposit");
                        double amount = input.nextDouble();

                        if(account.deposit(amount)) {
                            System.out.println("Deposit Successful");
                            System.out.println("Current Balance: " + account.getBalance());
                        }
                        else {
                            System.out.println("Amount must be positive");
                        }
                        break;

                    // Withdraw operation
                    case 2:

                        System.out.println("Enter Amount to Withdraw");
                        double amount2 = input.nextDouble();

                        if(account.withdraw(amount2)) {
                            System.out.println("Withdrawal Successful");
                            System.out.println("Current Balance :" + account.getBalance());
                        }
                        else {
                            System.out.println("Invalid withdrawal request ");
                        }

                        break;

                    // Display current balance
                    case 3:
                        double amount3 = account.getBalance();
                        System.out.println("Current Balance :" + amount3);
                        break;

                    // Exit application
                    case 4:
                        System.out.println("Thank you for using Banking Application.");
                        loop = false;
                        break;

                    default:
                        System.out.println("Invalid Choice");

                }
            }

            // Handles non-numeric user input
            catch (InputMismatchException e) {
                System.out.println("Invalid Input. please Enter Numeric Value only");
                input.nextLine();

            }
        }

    }

}