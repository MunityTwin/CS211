public class Fruit {
    private double pricePerUnit;
    private int stock;
    private int freshUntil;

    public Fruit(double pricePerUnit, int stock, int freshUntil) {
        this.pricePerUnit = pricePerUnit;
        setStock(stock);
        setFreshUntil(freshUntil);
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int num) {
        this.stock = num;
    }

    public int getFreshUntil() {
        return freshUntil;
    }

    public void setFreshUntil(int num) {
        this.freshUntil = num;
    }

    public String getUnits() {
        return "pounds";
    }

    public String name() {
        return "Fruit";
    }

    public String toString() {
        return "[" + name() + ": pricePerUnit=" + getPricePerUnit() +
        ", stock=" + getStock() + ", freshUntil=" + getFreshUntil() + 
        ", units=" + getUnits() + "]";
    }
}
