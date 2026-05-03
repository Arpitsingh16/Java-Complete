package Week1;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        boolean isRunning = true;
        Scanner sc = new Scanner(System.in);
        while(isRunning){
        System.out.print("Enter number 1: ");
        int a = sc.nextInt();
        System.out.print("Enter number 2: ");
        int b = sc.nextInt();
        System.out.println("Enter(+, -, *, /) and C to exit");
        char choice = sc.next().charAt(0);
        switch(choice){
            case '+':
                System.out.println("Addition = " + add(a,b));
                break;

            case '-':
        System.out.println("Subtraction = " + sub(a,b));
                break;

            case '*':
        System.out.println("Multiplication = " + mul(a,b));
                break;

            case '/':
        System.out.println("Division = " + div(a,b));
                break;

                case 'c' | 'C':
        isRunning = false;
                break;

            default:
                System.out.println("Enter Valid Operator");
            
        }
        
        }
       

        sc.close();
        
    }

    public static int add(int num1, int num2){
        return num1 + num2;
     }
    public static int sub(int num1, int num2){
        return num1 - num2;
     }
    public static int mul(int num1, int num2){
        return num1 * num2;
     }
    public static int div(int num1, int num2){
        return num1 / num2;
     }

    
    
}
