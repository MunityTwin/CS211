public class Watermelon extends Fruit {
    public Watermelon(int stock) {
        super(FruitWarehouse.watermelonPricePerUnit, stock, FruitWarehouse.WATERMELON_FRESH_DAYS);
    }

    public String name() {
        return "Watermelon";
    }
}
