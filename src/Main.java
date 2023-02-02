import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        copyFileUsingStream("/Users/ansarismagilov/Desktop/1.png", "/Users/ansarismagilov/Desktop/2.png");
    }

    private static void copyFileUsingStream(String source, String dest) throws IOException {

        InputStream fis = new FileInputStream(source);
        OutputStream fos = new FileOutputStream(dest);
        byte[] buffer = new byte[1024];
        int length;
        while ((length = fis.read(buffer)) > 0) {
            fos.write(buffer, 0, length);
        }
        fis.close();
        fos.close();
    }
}
