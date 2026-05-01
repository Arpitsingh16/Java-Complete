import java.util.Scanner;
public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount ba = new BankAccount();

        System.out.println("Enter Your Name: ");
        String name = sc.nextLine();

        System.out.println("Amount to be deposited: ");
        double depositingAmount = sc.nextDouble();

         System.out.println("Enter amount to be withdraw: ");
        double withdrawalAmount = sc.nextDouble();


        ba.setAccountHolderName(name);
        System.out.println("Account Holder: " + ba.getAccountHolderName());

        ba.deposit(depositingAmount);
        System.out.println("Balance after deposit: $" + ba.getBalance());

        ba.withdraw(withdrawalAmount);
        System.out.println("Balance after withdrawal: $" + ba.getBalance());

        sc.close();

    }
}

class BankAccount {
    private String accountHolderName;
    //private int accountNumber; 
    private double balance;

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited $" + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }


    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

    public double getBalance() {
        return balance;
    }
}

