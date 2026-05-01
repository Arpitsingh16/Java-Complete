import java.util.Scanner;

public class DeviceControl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SmartDevice[] devices = {
            new SmartFan(),
            new SmartLight(),
            new SmartTv()
        };

        String[] deviceNames = { "Fan", "Light", "TV" };

        while (true) {
            System.out.println("\nChoose a device to control:");
            for (int i = 0; i < devices.length; i++) {
                System.out.println((i + 1) + ". " + deviceNames[i]);
            }
            System.out.println("4. Exit");

            int choice = sc.nextInt();
            if (choice == 4) {
                System.out.println("Exiting Smart Home Controller.");
                break;
            }

            if (choice < 1 || choice > 3) {
                System.out.println("Invalid choice! Try again.");
                continue;
            }

            SmartDevice selectedDevice = devices[choice - 1];

            System.out.println("\nSelect Action:");
            System.out.println("1. Turn ON");
            System.out.println("2. Turn OFF");
            System.out.println("3. Get Status");

            int action = sc.nextInt();

            switch (action) {
                case 1:
                    selectedDevice.turnOn();
                    break;
                case 2:
                    selectedDevice.turnOff();
                    break;
                case 3:
                    selectedDevice.getStatus();
                    break;
                default:
                    System.out.println("Invalid action! Try again.");
            }
        }

        sc.close();
    }
}

interface SmartDevice {
    void turnOn();
    void turnOff();
    void getStatus();
}

class SmartFan implements SmartDevice {
    private boolean isOn = false;

    public void turnOn() {
        isOn = true;
        System.out.println("Smart Fan is turned ON.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Smart Fan is turned OFF.");
    }

    public void getStatus() {
        System.out.println("Smart Fan is " + (isOn ? "ON" : "OFF"));
    }
}

class SmartLight implements SmartDevice {
    private boolean isOn = false;

    public void turnOn() {
        isOn = true;
        System.out.println("Smart Light is turned ON.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Smart Light is turned OFF.");
    }

    public void getStatus() {
        System.out.println("Smart Light is " + (isOn ? "ON" : "OFF"));
    }
}

class SmartTv implements SmartDevice {
    private boolean isOn = false;

    public void turnOn() {
        isOn = true;
        System.out.println("Smart TV is turned ON.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Smart TV is turned OFF.");
    }

    public void getStatus() {
        System.out.println("Smart TV is " + (isOn ? "ON" : "OFF"));
    }
}
