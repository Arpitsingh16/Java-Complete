package Week1;

public class Car {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle();
        Vehicle vehicle2 = new Vehicle();
        vehicle1.start("Volvo", 2004);
        vehicle2.start("Maruti", 1998);
    }
}
 
class Vehicle{
    private String brand;
    private int year;

    void start(String brand, int year){
        System.out.println("This is a " + brand + " car from " + year );
    }
}