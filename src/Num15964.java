import java.io.*;

public class Num15964 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        String[] s = br.readLine().split(" ");
        long A = Long.parseLong(s[0]);
        long B = Long.parseLong(s[1]);

        long result = (A + B) * (A - B);

        bw.write(result+"\n");
        bw.flush();

    }
}