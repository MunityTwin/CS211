public class Watermelon extends Fruit {
    public Watermelon(int stock) {
        Fruit(stock * watermelonPricePerUnit * BULK_RATE, stock, WATERMELON_FRESH_DAYS);
    }

    public String name() {
        return "Watermelon";
    }
}
