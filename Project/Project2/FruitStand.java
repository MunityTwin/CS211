public class FruitStand {
    private Fruit[] availableFruit;
    private double cash;

    public Fruit[] getAvailableFruit() {
        return availableFruit;
    }

    public void setAvailableFruit(Fruit[] af) {
        this.availableFruit = af;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double c) {
        this.cash = c;
    }

    public int sellFruit(String name, int amount) {
        // Get the total number of fruit
        int totalFruit = availableFruit.length;

        // Keep track of the current fruit position in the array
        int fruitPos = 0;

        // Iterate over the available fruit array if there are
        // leftover amount of order and all items has not been checked
        while (amount > 0 && fruitPos < availableFruit.length) {
            // Check whether the two names are identical
            if (availableFruit[fruitPos].name().equals(name)) {
                // Fill the order and update cash obtained from selling fruit
                if (amount >= availableFruit[fruitPos].getStock()) {
                    amount -= availableFruit[fruitPos].getStock();
                    cash += availableFruit[fruitPos].getStock() * availableFruit[fruitPos].getPricePerUnit();
                    availableFruit[fruitPos].setStock(0);
                }
                else {
                    availableFruit[fruitPos].setStock(availableFruit[fruitPos].getStock() - amount);
                    cash += amount * availableFruit[fruitPos].getPricePerUnit();
                    amount = 0;
                }
            }

            // Check the next fruit in the list
            ++fruitPos;
        }

        return amount;
    }

    public double restock(int[] units) {
        double restockCost = 0;

        // Iterate through the fruit array
        for (int i = 0; i < availableFruit.length; ++i) {
            // Check whether the fruit needs to be restocked
            if (availableFruit[i].getStock() < units[i]) {
                // Check if the fruit is fresh, replace if needed
                if (availableFruit[i].getFreshUntil() < 1) {
                    availableFruit[i].setStock(0);
                }

                // Calculate the cost
                restockCost += (units[i] - availableFruit[i].getStock()) * availableFruit[i].getPricePerUnit() * FruitWarehouse.BULK_RATE;

                // Restock the fruit
                availableFruit[i].setStock(units[i]);
            }
        }

        // Reset cash
        cash = 0;

        return restockCost;
    }
}
