import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자, 이름");
        
        int i = scanner.nextInt();
        scanner.nextLine();
        String name = scanner.nextLine();

        System.out.println(i);
        System.out.println(name);
    }
}