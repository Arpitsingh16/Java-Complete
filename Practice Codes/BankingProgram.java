import java.util.Scanner;
public class BankingProgram {
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        double balance = 0;
        boolean isRunning = true;
        int choice;
        while(isRunning){
              System.out.println("Banking Program");
        System.out.println("1.Show Balance");
        System.out.println("2.Deposit");
        System.out.println("3.Withdraw");
        System.out.println("4.Exit");

        System.out.print("Enter Your Choice (1-4): ");
        choice = sc.nextInt();
        switch(choice){
            case 1:
            showBalance(balance);
            break;
            case 2:
            balance = balance+deposit();
            break;
            case 3:
            balance = balance-withdraw(balance);
            break;
            case 4:
            isRunning = false;
            break;
            default:
            System.out.println("Not Valid Choice");
        }
        }
            sc.close();
        
    }

    static void showBalance(double balance){
        System.out.println("$" + balance);
    }

    static double deposit(){
        double amount;
        System.out.print("Enter Amount To Be Deposited: ");
              amount = sc.nextDouble();
        if(amount<=0){
            System.out.println("Deposit Amount Cannot Be 0 Or Negative");
            return 0;
        } 
        else{
          return amount;  
        }      
    }

    static double withdraw(double balance){
        double amount;
        System.out.println("Enter Amount To Be Withdrawn: ");
        amount = sc.nextInt();
        if(amount > balance){
            System.out.println("Deposit Amount Can't Be More Than Balance");
              return 0;
        }
        else{
        return amount;
        }
    }
    
    
}
