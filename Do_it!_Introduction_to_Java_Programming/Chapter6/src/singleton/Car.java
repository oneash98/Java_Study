package singleton;

public class Car {
    static int serialNum = 10001;
    int carNum;

    public int getCarNum() {
        return this.carNum;
    }

    public Car() {
        this.carNum = serialNum;
        serialNum++;
    }
}
