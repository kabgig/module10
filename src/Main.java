import java.io.FileOutputStream;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException{
        String phrase = "GIVE ME THE CODE, PLEASE";
        int lng = phrase.length();
        byte[] letters = new byte[lng];
        for (int i = 0; i < lng; i++) {
            letters[i] = (byte)phrase.charAt(i);
        }
        FileOutputStream fos = new FileOutputStream("Root/files/request.txt");
        fos.write(letters,0,lng);
        fos.close();
    }
}
