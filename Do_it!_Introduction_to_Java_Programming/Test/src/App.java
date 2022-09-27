import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;


public class App {

    public static void create() {

        try(BufferedReader reader = new BufferedReader(new FileReader("src/test.txt"))) {
            int id = Integer.parseInt(reader.readLine());

            try(BufferedWriter writer = new BufferedWriter(new FileWriter("src/test.txt", false))) {
                writer.write(Integer.toString(id + 1));
            } catch(Exception e) {
                e.printStackTrace();
            }
            } catch(Exception e) {
                e.printStackTrace();
            }
    }
}