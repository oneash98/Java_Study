package stream.others;

import java.io.Console;

public class ConsoleTest {
    public static void main(String[] args) {
        Console console = System.console();

        System.out.println("이름:");
        String name = console.readLine();

        System.out.println(name);
    }
}
