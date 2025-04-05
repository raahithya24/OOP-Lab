abstract class Package {
    protected String trackingNumber;
    protected double weight;

    public Package(String trackingNumber, double weight) {
        this.trackingNumber = trackingNumber;
        this.weight = weight;
    }

    abstract double calculateShippingCost();
    
    public void showDetails() {
        System.out.println("Tracking Number: " + trackingNumber);
        System.out.println("Weight: " + weight + "kg");
    }
}

class StandardPackage extends Package {
    public StandardPackage(String trackingNumber, double weight) {
        super(trackingNumber, weight);
    }

    double calculateShippingCost() {
        return weight * 10; 
    }
}

class ExpressPackage extends Package {
    public ExpressPackage(String trackingNumber, double weight) {
        super(trackingNumber, weight);
    }

    double calculateShippingCost() {
        return weight * 20; 
    }
}

public class PackageDelivery {
    public static void main(String[] args) {
        Package standard = new StandardPackage("STD12345", 7.5);
        Package express = new ExpressPackage("EXP67890", 9.2);

        standard.showDetails();
        System.out.println("Standard Shipping Cost: " + standard.calculateShippingCost());

        express.showDetails();
        System.out.println("Express Shipping Cost: " + express.calculateShippingCost());
    }
}
