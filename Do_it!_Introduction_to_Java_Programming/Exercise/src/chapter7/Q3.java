package chapter7;
import java.util.ArrayList;

public class Q3 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int total = 0;

        for(int i = 1; i <= 10; i++) {
            if(i % 2 == 0) {
                arr.add(i);
                total += i;
            }
        }

        for(int i: arr){
            System.out.println(i);
        }
        System.out.println(total);
    }
}