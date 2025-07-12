import java.io.*;
import java.nio.Buffer;

public class Num27866 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        int i = Integer.parseInt(br.readLine());

        char ch = s.charAt(i-1);
        bw.write(ch);
        bw.flush();
    }
}