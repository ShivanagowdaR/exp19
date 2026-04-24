import java.util.Scanner;

public class BankService {

    
    static class BankAccount {
        double balance;

        // Constructor
        BankAccount(double money) {
            balance = money;
        }

        // Deposit money
        void deposit(double money) {
            balance = balance + money;
        }

        // Withdraw money
        void withdraw(double money) {
            balance = balance - money;
        }

        // Show balance
        double getBalance() {
            return balance;
        }
    }

    
    public static void main(String[] args) {

        BankAccount acc = new BankAccount(5000);

        System.out.println("Initial Balance: " + acc.getBalance());

        acc.deposit(700);
        System.out.println("After Deposit: " + acc.getBalance());

        acc.withdraw(100);
        System.out.println("After Withdraw: " + acc.getBalance());

        System.out.println("Final Balance: " + acc.getBalance());
    }
}
}
