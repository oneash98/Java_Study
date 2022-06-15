package template;

public class CarTest {
    public static void main(String[] args) {
        System.out.println("=== 자율 주행 ===");
        Car myCar = new AICar();
        myCar.run();

        System.out.println("=== 사람 주행 ===");
        Car hisCar = new ManualCar();
        hisCar.run();
    }
}
