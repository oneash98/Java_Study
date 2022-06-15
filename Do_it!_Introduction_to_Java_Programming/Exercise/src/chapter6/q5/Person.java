package chapter6.q5;

public class Person {
    String personName;

    public Person(String personName) {
        this.personName = personName;
    }

    public void buyCoffee(Cafe cafeName, Menu coffeeMenu) {
        cafeName.take(coffeeMenu.getCoffeePrice());
    }
}
