package stream.decorator;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyTest {
    public static void main(String[] args) {
        long millesecond = 0;
        
        try(FileInputStream fis = new FileInputStream("자바의정석3 문제해설.pdf");
        FileOutputStream fos = new FileOutputStream("copy.pdf")) {
            millesecond = System.currentTimeMillis(); // 파일 복사 시작 전 시간
            int i;
            while((i = fis.read()) != -1) {
                fos.write(i);
            }
            millesecond = System.currentTimeMillis() - millesecond;
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("파일 복사 시간: " + millesecond);
    }
}
