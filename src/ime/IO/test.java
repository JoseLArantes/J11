import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;


public class InteracaoKeyboard {
	public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader buffer = new BufferedReader(isr);
        System.out.println(buffer.readLine());
    }
}
