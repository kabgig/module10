import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream streaming = new FileInputStream("Root/files/asciitable.txt");
        int count = 0;
        int num = 0;
        while (num != -1) {
            try {
                num = streaming.read();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            if ('0' <= num && num <= '9') count++;
        }
        System.out.println(count);
        try {
            streaming.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

