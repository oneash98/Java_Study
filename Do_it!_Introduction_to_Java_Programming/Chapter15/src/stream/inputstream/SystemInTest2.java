package stream.inputstream;

import java.io.IOException;

public class SystemInTest2 {
    public static void main(String[] args) {
        System.out.println("알파벳 여러개 입력");

        int i;

        try {
            while((i = System.in.read()) != -1) {
                System.out.println((char)i);
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
