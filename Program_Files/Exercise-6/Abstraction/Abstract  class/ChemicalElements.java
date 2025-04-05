import java.util.Scanner;

abstract class Element {
    protected String name;
    protected String symbol;
    protected int atomicNumber;

    public Element(String name, String symbol, int atomicNumber) {
        this.name = name;
        this.symbol = symbol;
        this.atomicNumber = atomicNumber;
    }

    abstract void elementProperties();

    public void showDetails() {
        System.out.println("\nElement: " + name);
        System.out.println("Symbol: " + symbol);
        System.out.println("Atomic Number: " + atomicNumber);
    }
}

class Metal extends Element {
    public Metal(String name, String symbol, int atomicNumber) {
        super(name, symbol, atomicNumber);
    }

    void elementProperties() {
        System.out.println("Properties: Good conductor of heat and electricity");
    }
}

class NonMetal extends Element {
    public NonMetal(String name, String symbol, int atomicNumber) {
        super(name, symbol, atomicNumber);
    }

    void elementProperties() {
        System.out.println("Properties: Poor conductor");
    }
}

public class ChemicalElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Element[] elements = {
            new Metal("Iron", "Fe", 26),
            new Metal("Copper", "Cu", 29),
            new Metal("Aluminum", "Al", 13),
            new NonMetal("Oxygen", "O", 8),
            new NonMetal("Carbon", "C", 6),
            new NonMetal("Sulfur", "S", 16)
        };

        System.out.print("Enter an element name (Iron, Copper, Aluminum, Oxygen, Carbon, Sulfur): ");
        String inputName = scanner.nextLine().trim();

        Element foundElement = null;
        for (Element e : elements) {
            if (e.name.equalsIgnoreCase(inputName)) {
                foundElement = e;
                break;
            }
        }

        if (foundElement != null) {
            foundElement.showDetails();
            foundElement.elementProperties();
        } else {
            System.out.println("Element not found! Please enter a valid element name.");
        }

        scanner.close();
    }
}
