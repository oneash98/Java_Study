package chapter4;

public class Q3 {
    public static void main(String[] args) {
        int dan;
        int num;

        for(dan = 2; dan <= 9; dan++) {
            for(num = 1; num <= 9; num++) {
                if(num > dan) break;
                System.out.println(dan * num);
            }
            System.out.println();
        }
    }
}
