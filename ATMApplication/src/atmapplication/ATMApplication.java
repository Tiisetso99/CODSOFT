/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atmapplication;

/**
 *
 * @author motsi
 */
public class ATMApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BankAccount account = new BankAccount(1000.00);
        ATM atm = new ATM(account);
        atm.start();
    }
    
}
