class Appliance {
    public void turnOn() {
        System.out.println("Appliance is now ON.");
    }
    public void turnOff() {
        System.out.println("Appliance is now OFF.");
    }
}
 class WashingMachine extends Appliance {
    void washClothes() {
        System.out.println("Washing machine is washing clothes...");
    }
}
public class Electronics {
    public static void main(String[] args) {
        WashingMachine myWasher = new WashingMachine();  
        myWasher.turnOn();              
        myWasher.turnOff();         
        myWasher.washClothes();
    }
}