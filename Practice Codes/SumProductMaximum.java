import java.util.Scanner;
public class SumProductMaximum {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

      System.out.println("Enter Number 1");
      int a = sc.nextInt();
       System.out.println("Enter Number 2");
      int b = sc.nextInt();
      printInfo("Arpit",17);
    //   System.out.print(printInfo("Arpit",17));
       System.out.println(sum(a,b));
       System.out.println( product(a,b));     
       System.out.println(Math.max(a,b));   

       sc.close();
    }

    static int sum(int num1 , int num2){
        return num1 + num2;
    }

        static int product(int num1 , int num2){
        return num1 * num2;
    }

    static void printInfo(String name ){
        System.out.println("Your Name Is:" + name);
    }
    static void printInfo(String name , int age){
        System.out.println("Your Name Is: " + name + " Your Age Is: " + age);
    }
    
}
