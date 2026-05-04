package Week2;
import java.io.*;

public class FileCreate {
    public static void main(String[] args) {
        
        try {
            File fc = new File("Text1.txt");
            if(fc.createNewFile()){
                System.out.println("File Created" + fc.getName());
            }
            else{
                System.out.println("File Already Exists");
                fc.delete();
                System.out.println("Deleting File...");
            }
        } catch (Exception e) {
            System.out.println("Error Occured");
        }
    }
    
}
