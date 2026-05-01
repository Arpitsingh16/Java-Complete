package Week1;
import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {

        Student stud = new Student();
        
        stud.displayInfo();
    }
    
}

  class Student{
    Scanner sc = new Scanner(System.in);

    void displayInfo(){
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Enter you grade: ");
        double grade = sc.nextDouble();

        System.out.println("Welcome " + name + " You are " + age + " years old " + " and your grade is " + grade);
    }

  }
