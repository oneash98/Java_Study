package chapter4;

public class Q2 {
    public static void main(String[] args) {
        int dan;
        int num;
        for(dan = 2; dan <= 9; dan++) {
            if(dan % 2 == 1) continue;
            for(num = 1; num <= 9; num++) {
                System.out.println(dan * num);
            }
            System.out.println();
        }
    }
}
