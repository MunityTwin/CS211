public class Banana extends Fruit {
    public Banana(int stock) {
        Fruit(stock * bananaPricePerUnit * BULK_RATE, stock, BANANA_FRESH_DAYS);
    }

    public String name() {
        return "Banana";
    }

    public String getUnits() {
        return "bunch";
    }
}