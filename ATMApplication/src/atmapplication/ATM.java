package atmapplication;

/**
 *
 * @author motsi
 */
public class ATM {
    
    private BankAccount account;
    
    public ATM(BankAccount account){
        this.account = account;
    }
    private void checkBankBalance(){
        System.out.println("Your current bank balance is: R "+account.getBalance());
    }
    public void start(){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        boolean running = true;
        
        while(running){
            System.out.println("\n Welcome to the bank of billionares. Please select an option to continue:");
            System.out.println("1. Check Bank Balance");
            System.out.println("2. Deposit into bank account");
            System.out.println("3. Withdraw from account");
            System.out.println("4. Exit");
            
            int optSelected = scanner.nextInt();
            switch(optSelected){
                case 1: 
                    checkBankBalance();
                 break;
                     case 2:
                         System.out.print("Please enter your deposit amount");
                         double amountToDeposit = scanner.nextDouble();
                         account.deposit(amountToDeposit);
                         break;
                     case 3: 
                         System.out.print("Please enter amount you want to withdraw");
                         double amountToWithdraw =  scanner.nextDouble();
                         account.withdraw(amountToWithdraw);
                         break;
                     case 4 :
                         running = false;
                         System.out.println("Thank you for using the bank of billionares. Goodbye.");
                         break;
                     default:
                         System.out.println("Invalid choice selected. Please try again");
                     
                         
                    
            }
        }
        scanner.close();
    }
    
    
}
