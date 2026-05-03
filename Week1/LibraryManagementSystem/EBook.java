package Week1.LibraryManagementSystem;

public class EBook extends Book {

    private double fileSize;

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    public EBook(String title, String author, String isbn, boolean isAvailable, double fileSize) {
        super(title, author, isbn, isAvailable);  
        this.fileSize = fileSize; 
    }
  
}
