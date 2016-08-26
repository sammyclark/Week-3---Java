package CoffeeProgramme;

/**
 * Created by student on 26/08/2016.
 */
public class Cafe {
    private int beansInStock = 0;
    private int milkInStock = 0;

    public Coffee brew(CoffeeType coffeeType) {
        return brew(coffeeType, 1);
    }

    public Coffee brew(CoffeeType coffeeType, int quantity) {
        requirePositive(quantity);

        int requireBeans = coffeeType.getRequiredBeans() * quantity;
        int requiredMilk = coffeeType.getRequiredMilk() * quantity;

        if (requireBeans > beansInStock || requiredMilk > milkInStock)
            throw new IllegalStateException("Insufficient beans or milk");

        beansInStock -= requireBeans;
        milkInStock -= requiredMilk;

        return new Coffee(coffeeType, requireBeans, requiredMilk);

    }

    public void requirePositive(int value) {
        if (value < 1)
            throw new IllegalArgumentException();
    }
    //do not run if value is less than one

    public void restockBeans(int weightInGrams) {
        requirePositive(weightInGrams);
        beansInStock += weightInGrams;
    }

    public void restockMilk(int weightinGrams) {
        requirePositive(weightinGrams);
        milkInStock += weightinGrams;
    }
}

