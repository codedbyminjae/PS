import java.io.*;

public class Num11654 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        char ch = s.charAt(0);

        int a = (int) ch;

        bw.write(a + "\n");
        bw.flush();
    }
}