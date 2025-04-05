class Planet {
    String name;
    double mass; 
    double radius; 
    double gravity; 

    void display() {
        System.out.println("Planet: " + name);
        System.out.println("Mass: " + mass + " kg");
        System.out.println("Radius: " + radius + " km");
        System.out.println("Gravity: " + gravity + " m/s²");
        System.out.println("--------------------------");
    }
}

class Earth extends Planet {
    Earth() {
        name = "Earth";
        mass = 5.972 * Math.pow(10, 24);
        radius = 6371;
        gravity = 9.8;
    }
}

class Mars extends Planet {
    Mars() {
        name = "Mars";
        mass = 6.39 * Math.pow(10, 23);
        radius = 3389.5;
        gravity = 3.71;
    }
}

class Venus extends Planet {
    Venus() {
        name = "Venus";
        mass = 4.867 * Math.pow(10, 24);
        radius = 6051.8;
        gravity = 8.87;
    }
}

public class PlanetDetails {
    public static void main(String[] args) {
        Earth e = new Earth();
        Mars m = new Mars();
        Venus v = new Venus();

        e.display();
        m.display();
        v.display();
    }
}
