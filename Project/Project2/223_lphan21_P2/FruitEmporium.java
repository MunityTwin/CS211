public class FruitEmporium {
    private FruitStand[] stands;

    public FruitStand[] getStands() {
        return stands;
    }

    public void setStands(FruitStand[] s) {
        this.stands = s;
    }

    public FruitEmporium(FruitStand[] s) {
        setStands(s);
    }

    public double totalCash() {
        // Iterate through all fruit stand, calculate the sum of cash
        double sum = 0;
        for (int i = 0; i < stands.length; ++i) {
            sum += stands[i].getCash();
        }

        return sum;
    }

    public double restockAllStands(int units) {
        double totalCost = 0;

        for (int i = 0; i < stands.length; ++i) {
            // For each fruit stands, create an array of integers with the
            // same length as the availableFruit array
            int[] unitsArr = new int[stands[i].getAvailableFruit().length];

            // Fill the array with the given units
            for (int j = 0; j < unitsArr.length; ++j) {
                unitsArr[j] = units;
            }

            // Call each fruit stand's restock method, calculate the total cost
            totalCost += stands[i].restock(unitsArr);
        }

        return totalCost;
    }

    public int sellFruit(String name, int amount) {
        // Iterate through all stands in the fruit emporium
        for (int i = 0; i < stands.length; ++i) {
            // Check whether the order has been filled
            if (amount > 0) {
                amount = stands[i].sellFruit(name, amount);
            }
            else {
                break;
            }
        }

        return amount;
    }
}
