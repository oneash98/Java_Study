import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        int i;

        try{
            i = System.in.read();
            System.out.println((char)i);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
