import java.util.Scanner;
public class OnlinePay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select Payment Method");
        System.out.println("1.Select Credit Card");
        System.out.println("2.Select UPI");
        System.out.println("3.Select Cash");
        
        int choice = sc.nextInt();
        switch(choice){
            case 1:
            PaymentMethod pm1 = new CreditCard();
            pm1.pay(5000.08);
            break;

            case 2:
            PaymentMethod pm2 = new Upi();
            pm2.pay(300.08);
            break;

            case 3:
            PaymentMethod pm3 = new Cash();
            pm3.pay(200.08);
            break;

            default:
            System.out.println("Invalid Choice");

        }
        sc.close();

        
    }
    
}

class PaymentMethod{
    void pay(double amount){
        System.out.println("Paying " + amount);
    }
}

class CreditCard extends PaymentMethod{
  void pay(double amount){
  System.out.println("Paying " + amount + " using credit card");
    }
}

class Upi extends PaymentMethod{
  void pay(double amount){
  System.out.println("Paying " + amount + " using upi");
    }
}

class Cash extends PaymentMethod{
  void pay(double amount){
  System.out.println("Paid " + amount + " using cash");
    }
}
