import java.util.Scanner;
public class OnlineTransportService {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in km: ");
        double distance = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Choice of Transport: ");
        System.out.print("1.Bus");
        System.out.print("2.Train");
        System.out.print("3.Taxi");

        int choice = sc.nextInt();
        switch(choice){
            case 1:
            Transport t1 = new Bus();
            t1.book(distance);
            break;

            case 2:
            Transport t2 = new Train();
            t2.book(distance);
            break;

            case 3:
            Transport t3 = new Taxi();
            t3.book(distance);
            break;
        }

        sc.close();

        
    }
    
}

abstract class Transport{
    abstract void book (double distance);

    void payment(double amount){
        System.out.println("Payment of " + amount + " is done");
    }
}

class Bus extends Transport{
    void book(double distance){
        double fare = distance * 5;
        System.out.println("Bus booked for " + distance + " fare: " + fare);
    }
}

class Train extends Transport{
    void book(double distance){
        double fare = distance * 10;
        System.out.println("Train booked for " + distance + " fare: " + fare);
    }
}

class Taxi extends Transport{
    void book(double distance){
        double fare = distance * 15;
        System.out.println("Taxi booked for " + distance + " fare: " + fare);
    }
}