abstract class Device {
    protected String deviceName;
    protected boolean isOn;

    public Device(String deviceName) {
        this.deviceName = deviceName;
        this.isOn = false;
    }

    public void turnOn() {
        isOn = true;
        System.out.println(deviceName + " is turned ON.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println(deviceName + " is turned OFF.");
    }

    abstract void performFunction();
}

class SmartLight extends Device {
    public SmartLight(String deviceName) {
        super(deviceName);
    }

    void performFunction() {
        System.out.println("Adjusting brightness of " + deviceName);
    }
}

class SmartThermostat extends Device {
    public SmartThermostat(String deviceName) {
        super(deviceName);
    }

    void performFunction() {
        System.out.println("Adjusting temperature of " + deviceName);
    }
}

public class HomeAutomation {
    public static void main(String[] args) {
        Device light = new SmartLight("Living Room Light");
        Device thermostat = new SmartThermostat("Bedroom Thermostat");

        light.turnOn();
        light.performFunction();

        thermostat.turnOn();
        thermostat.performFunction();
    }
}
