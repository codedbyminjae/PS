import java.io.*;

public class Num2480 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String[] s = br.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int c = Integer.parseInt(s[2]);

        int sum;

        if (a == b && b == c) {
            sum = 10000 + a * 1000;
        } else if (a == b || a == c) {
            sum = 1000 + a * 100;
        } else if (b == c) {
            sum = 1000 + b * 100;
        } else {
            int max = Math.max(a, Math.max(b, c));
            sum = max * 100;
        }

        bw.write(sum + "\n");
        bw.flush();
    }
}