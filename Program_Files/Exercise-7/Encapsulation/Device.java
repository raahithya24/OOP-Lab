import java.util.Scanner;

interface ElectronicDevice {
    void powerOn();
    void powerOff();
    void setVolume(int volume);
}

class Smartphone implements ElectronicDevice {
    private int volume;

    public void powerOn() {
        System.out.println("Smartphone is now ON.");
    }

    public void powerOff() {
        System.out.println("Smartphone is now OFF.");
    }

    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 10) {
            this.volume = volume;
            System.out.println("Smartphone Volume set to: " + volume);
        } else {
            System.out.println("Invalid Volume! Set between 0 - 10.");
        }
    }
}

class Laptop implements ElectronicDevice {
    private int volume;

    public void powerOn() {
        System.out.println("Laptop is now ON.");
    }

    public void powerOff() {
        System.out.println("Laptop is now OFF.");
    }

    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
            System.out.println("Laptop Volume set to: " + volume);
        } else {
            System.out.println("Invalid Volume! Set between 0 - 100.");
        }
    }
}

public class Device {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ElectronicDevice device = null;

        System.out.println("Select Device: 1. Smartphone  2. Laptop");
        int choice = scanner.nextInt();

        if (choice == 1) {
            device = new Smartphone();
        } else if (choice == 2) {
            device = new Laptop();
        } else {
            System.out.println("Invalid Choice!");
            return;
        }

        device.powerOn();

        System.out.print("Set Volume: ");
        int volume = scanner.nextInt();
        device.setVolume(volume);

        device.powerOff();

        scanner.close();
    }
}
