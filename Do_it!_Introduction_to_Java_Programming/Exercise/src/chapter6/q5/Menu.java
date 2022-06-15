package chapter6.q5;

public class Menu {
    private String coffeeName;
    private int coffeePrice;

    public Menu(String coffeeName, int coffeePrice) {
        this.coffeeName = coffeeName;
        this.coffeePrice = coffeePrice;
    }

    public String getCoffeeName() {
        return this.coffeeName;
    }

    public int getCoffeePrice() {
        return this.coffeePrice;
    }
}
