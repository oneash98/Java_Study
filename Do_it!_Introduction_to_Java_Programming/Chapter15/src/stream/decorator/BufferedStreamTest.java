package stream.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamTest {
    public static void main(String[] args) {
        long millesecond = 0;

        try(FileInputStream fis = new FileInputStream("자바의정석3 문제해설.pdf");
        FileOutputStream fos = new FileOutputStream("copy.pdf");
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos)) {
            millesecond = System.currentTimeMillis();
            int i;
            while((i = bis.read()) != -1) {
                bos.write(i);
            }
            millesecond = System.currentTimeMillis() - millesecond;
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("파일 복사 시간: " + millesecond);
    }
}
