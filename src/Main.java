import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Root/files/answer.txt");
        FileInputStream streaming = new FileInputStream(file);
        int i = 0;

        while (i != -1) {
            try {
                i = streaming.read();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }
}
