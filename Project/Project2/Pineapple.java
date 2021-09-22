public class Pineapple extends Fruit {
    public Pineapple(int stock) {
        Fruit(stock * pineapplePricePerUnit * BULK_RATE, stock, PINEAPPLE_FRESH_DAYS);
    }

    public String name() {
        return "Pineapple";
    }

    public String getUnits() {
        return "item";
    }
}
