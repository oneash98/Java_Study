package stream.others;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("이름:");
        String name = scanner.nextLine();

        System.out.println(name);

        scanner.close();
    }
}