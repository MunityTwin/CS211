public class Banana extends Fruit {
    public Banana(int stock) {
        super(FruitWarehouse.bananaPricePerUnit, stock, FruitWarehouse.BANANA_FRESH_DAYS);
    }

    public String name() {
        return "Banana";
    }

    public String getUnits() {
        return "bunch";
    }
}