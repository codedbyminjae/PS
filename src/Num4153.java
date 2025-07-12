import java.io.*;

public class Num4153 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        while (true) {
            String[] t = br.readLine().split(" ");
            int a = Integer.parseInt(t[0]);
            int b = Integer.parseInt(t[1]);
            int c = Integer.parseInt(t[2]);

            if (a == 0 && b == 0 && c == 0)
                break;

            int max = Math.max(a, Math.max(b, c));
            int result;

            if (max == a) {
                result = b*b + c*c;
            } else if (max == b) {
                result = a*a + c*c;
            } else {
                result = a*a + b*b;
            }

            if (max*max == result) {
                bw.write("right" + "\n");
            } else {
                bw.write("wrong" + "\n");
            }
        }
        bw.flush();
    }
}