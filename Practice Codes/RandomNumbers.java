import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
            Random random = new Random();
            int num1 = random.nextInt(1,7);
            int num2 = random.nextInt(1,7);
            int num3 = random.nextInt(1,7);

            System.out.print(num1);
            System.out.print(num2);
            System.out.print(num3);
            
        
    }
    
}
