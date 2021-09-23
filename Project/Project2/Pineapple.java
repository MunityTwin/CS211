public class Pineapple extends Fruit {
    public Pineapple(int stock) {
        super(FruitWarehouse.pineapplePricePerUnit, stock, FruitWarehouse.PINEAPPLE_FRESH_DAYS);
    }

    public String name() {
        return "Pineapple";
    }

    public String getUnits() {
        return "item";
    }
}
