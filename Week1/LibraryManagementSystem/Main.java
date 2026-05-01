package Week1.LibraryManagementSystem;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Harry Potter", "JK Rowling", "Yes", false);
        book.returnItem();
        book.borrowItem();
        
    }
    
}
