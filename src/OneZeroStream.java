import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class OneZeroStream extends InputStream {

    public int read() throws IOException {
        List<Integer> numbers = List.of(1,0,1,0,1,0,1,0,1,0);
        return 1010101010;
    }
}
