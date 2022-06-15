package chapter4;

public class Q4 {
    public static void main(String[] args) {
        int lines = 4;
        int i;
        for(i = 1; i <= lines; i++) {
            int stars = i * 2 - 1;
            int space = ((lines * 2 - 1) - stars) / 2;

            for(int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j<= stars; j++) {
                System.out.print("*");
            }
            for(int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
