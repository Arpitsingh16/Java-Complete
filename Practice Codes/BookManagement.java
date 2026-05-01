import java.util.Scanner;

public class BookManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book[] books = new Book[3];

        for (int i = 0; i < books.length; i++) {
            System.out.println("Select Book Type for Slot " + (i + 1));
            System.out.println("1. Fiction Book");
            System.out.println("2. Science Book");
            System.out.println("3. History Book");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    books[i] = new FictionBook();
                    break;

                case 2:
                    books[i] = new ScienceBook();
                    break;

                case 3:
                    books[i] = new HistoryBook();
                    break;

                default:
                    System.out.println("Invalid choice");

            }
        }

        System.out.println("Book Details");
        for (Book b : books) {
            b.displayInfo();
            System.out.println("Late Fee for 5 days: " + b.getLateFees(5));
        }

        sc.close();
    }
}


class Book {
    void displayInfo() {
        System.out.println("Book Information");
    }

    double getLateFees(int daysLate) {
        return daysLate * 5; 
    }
}

class FictionBook extends Book {
    @Override
    void displayInfo() {
        System.out.println("Fiction Book: 'The Great Gatsby'");
    }

    @Override
    double getLateFees(int daysLate) {
        return daysLate * 5;
    }
}

class ScienceBook extends Book {
    @Override
    void displayInfo() {
        System.out.println("Science Book: 'A Brief History of Time'");
    }

    @Override
    double getLateFees(int daysLate) {
        return daysLate * 1.5;
    }
}


class HistoryBook extends Book {
    @Override
    void displayInfo() {
        System.out.println("History Book: 'Sapiens'");
    }

    @Override
    double getLateFees(int daysLate) {
        return daysLate * 1.2;
    }
}

