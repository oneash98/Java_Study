package chapter6.q5;

public class CoffeeTest {
    public static void main(String[] args) {
        Person kim = new Person("Kim");
        Person lee = new Person("Lee");

        Cafe starCafe = new Cafe("StarCafe");
        Cafe beanCafe = new Cafe("BeanCafe");
        
        Menu americano = new Menu("Americano", 4000);
        Menu latte = new Menu("Latte", 4500);

        kim.buyCoffee(starCafe, americano);
        lee.buyCoffee(beanCafe, latte);

        System.out.println(starCafe.getIncome());
        System.out.println(beanCafe.getIncome());

        
    }
}
