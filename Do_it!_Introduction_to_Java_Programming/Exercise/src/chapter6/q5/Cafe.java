package chapter6.q5;

public class Cafe {
    private String cafeName;
    private int income;

    public String getCafeName() {
        return this.cafeName;
    }

    public int getIncome() {
        return this.income;
    }

    public Cafe(String cafeName) {
        this.cafeName = cafeName;
        this.income = 0;
    }

    public void take(int money) {
        this.income += money;
    }
}
