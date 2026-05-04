package Week2;
import java.io.*;

public class WriteFile {
    public static void main(String[] args) {
        try {
            // File f = new File("File1.txt", true);
            // if(f.createNewFile()){
            //     System.out.println(f.getName() + " created");
            FileWriter fw = new FileWriter("FIle1.txt", true);
            fw.write("Adding new messages");
            System.out.println("Added new message Succesfully");
            fw.close();
            // }

            // else{
            //     System.out.println("File already exists");
            //     // f.delete();
            //     // System.out.println("Deleting File " + f.getName());
            // }
        } catch (Exception e) {
            System.out.println("Error Occured..");
        }
    }
}
