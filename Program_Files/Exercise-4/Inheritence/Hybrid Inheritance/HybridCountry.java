class Country {
    void countryInfo() {
        System.out.println("This is a country.");
    }
}

class State extends Country {
    void stateInfo() {
        System.out.println("This is a state within a country.");
    }
}

class District extends State {
    void districtInfo() {
        System.out.println("This is a district within a state.");
    }
}

class City extends State {
    void cityInfo() {
        System.out.println("This is a city within a state.");
    }
}

public class HybridCountry {
    public static void main(String[] args) {
        District d = new District();
        City c = new City();

        d.countryInfo();
        d.stateInfo();
        d.districtInfo();
        System.out.println("-----------------");
        c.countryInfo();
        c.stateInfo();
        c.cityInfo();
    }
}
