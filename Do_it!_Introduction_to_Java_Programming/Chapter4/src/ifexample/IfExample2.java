package ifexample;

public class IfExample2 {
    public static void main(String[] args) {
        int age = 9;
        int charge;

        if (age < 8) {
            charge = 1000;
        }
        else if (age < 14) {
            charge = 2000;
        }
        else if (age < 20) {
            charge = 2500;
        }
        else {
            charge = 3000;
        }

        System.out.println("입장료는 " + charge + "원입니다.");
    }
}
