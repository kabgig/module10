import java.io.*;
import java.nio.charset.Charset;
import java.time.Duration;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) throws IOException {

        copyFileUsingStream(
                "3.txt",
                Charset.forName("UTF-8"),
                "3.txt",
                Charset.forName("WINDOWS-1251"));
    }

    private static void copyFileUsingStream(String source, Charset sEnc, String dest, Charset dEnc) throws IOException {
        var start = LocalTime.now();

        FileReader fis = new FileReader(source, sEnc);
        FileWriter fos = new FileWriter(dest, dEnc);
        char[] buffer = new char[1024];
        int length;
        while ((length = fis.read(buffer)) > 0) {
            fos.write(buffer, 0, length);
        }
        fis.close();
        fos.close();
        var end = LocalTime.now();
        var duration = Duration.between(start, end);
        System.out.println(duration.toMillis());
    }
}
