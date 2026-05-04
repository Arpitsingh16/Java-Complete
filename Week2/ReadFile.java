package Week2;
import java.util.Scanner;
import java.io.*;

public class ReadFile {
        public static void main(String[] args) {
        File fc = new File("File2.txt");
        try(Scanner fr = new Scanner(fc)) { 
            
            while(fr.hasNextLine()){
                String data = fr.nextLine();
                System.out.println("Reading... " + data);
            }
            fr.close();
        } catch (Exception e) {
            System.out.println("Error Occured");
                  e.printStackTrace();
        }
    }
}
