import java.io.IOException;
import java.io.InputStream;

public class OneZeroStream extends InputStream {
        int count = 0;
        byte[] numbers = {1, ' ', 0, ' ', 1, ' ', 0, ' ', 1, ' ', 0, ' ', 1, ' ', 0, ' ', 1, ' ', 0, ' '};

    public byte read() throws IOException {
        if (count == numbers.length) count = 0;
        return numbers[count++];
    }
}
