import java.io.*;

public class Num2884 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        int r = m-45;
        if (r < 0) {
            n = n-1;
            r = m + 60 - 45;
            if (n < 0) {
                n = 23;
            }
        }
        bw.write(n+" "+r+"\n");
        bw.flush();

    }
}