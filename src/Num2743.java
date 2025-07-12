import java.io.*;

public class Num2743 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String s = br.readLine();

        int len = s.length();

        bw.write(len+"\n");
        bw.flush();

    }
}