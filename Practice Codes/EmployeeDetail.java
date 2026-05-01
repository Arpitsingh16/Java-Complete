import java.util.Scanner;
public class EmployeeDetail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your Employee id: ");
        int id = sc.nextInt();
        System.out.print("Enter your Salary: ");
        double salary = sc.nextDouble();

        Employee emp = new Employee(name , id , salary);
        emp.printDetail();
        emp.checkSalaryLevel();

        sc.close();
        
    }
    
}

class Employee{
    String name;
    int id;
    double salary;

    Employee(String name , int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void printDetail(){
       System.out.println("\nEmployee Details:");
       System.out.println("Name: " + name);
       System.out.println("ID: " + id);
       System.out.println("Salary: $" + salary);
    }

    void checkSalaryLevel(){
        if(salary <= 1000){
          System.out.println("Low Salary Worker");
        }
        else if(salary <= 5000 ){
            System.out.println("Medium Salary Worker");
        }
        else {
            System.out.println("High Salary Worker");
        }
    }
}
