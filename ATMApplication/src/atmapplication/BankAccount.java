package atmapplication;

/**
 *
 * @author motsi
 */
public class BankAccount {
    
    private double BankBalance;
    
    public BankAccount(double startingBalance){
        this.BankBalance = startingBalance;
    }
    public double getBalance(){
        return BankBalance;
    }
    
    public boolean deposit(double amount){
        if(amount > 0){
            BankBalance += amount;
            System.out.println("Your Deposit was successful. Your new balance is: R"+ BankBalance);
            return true;
        }
        else{
            System.out.println("Invalid deposit amount.");
            return false;
        }
    }
    
    public boolean withdraw(double amount){
        if (amount > 0 && amount <= BankBalance){
            BankBalance -= amount;
            System.out.println("Your withdraw was successful. Your new balance is: R"+ String.format("%.2f",BankBalance));
            return true; 
        } else if (amount > BankBalance){
            System.out.println("You have insufficient funds for the requested amount.");
            return false;
        }
        else{
            System.out.println("Your withdraw was unsuccessful.");
            return false;
        }
        
    }
    
    
}
