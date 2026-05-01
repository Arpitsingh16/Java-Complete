import java.util.Scanner;
public class PersonDetail {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Your Age: ");
        int age = sc.nextInt();
        Person pers = new Person(name , age);
        pers.printDetails();

        sc.close();
    }
    
}

class Person{
    String name;
    int age;


    Person(String name , int age){
        this.name = name;
        this.age = age;
    }

     void printDetails(){
        System.out.println("Your Name Is: " + name + " Your Age Is: " + age);
     }


}
