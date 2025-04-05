class Stock {
    String companyName;
    double currentPrice;
    double changePercentage;

    Stock(String name, double price, double change) {
        companyName = name;
        currentPrice = price;
        changePercentage = change;
    }

    void showStockDetails() {
        System.out.println("Company: " + companyName);
        System.out.println("Current Price:" + currentPrice+"/-");
        System.out.println("Price Change: " + changePercentage + "%");
        if (changePercentage > 0) {
            System.out.println("Status: Gained");
        } else if (changePercentage < 0) {
            System.out.println("Status: Lost");
        } else {
            System.out.println("Status: No Change");
        }
    }

    public static void main(String[] args) {
        Stock s1 = new Stock("Tata Motors", 860.50, 1.75);
        Stock s2 = new Stock("Infosys", 1400.25, -0.50);

        s1.showStockDetails();
        
        s2.showStockDetails();
    }
}
