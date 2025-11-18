import java.io.*;

public class Num5086 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main (String[] args) throws IOException {
        while (true) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            if (a == 0 && b == 0) {
                break;
            }

            if (b % a == 0) {
                bw.write("factor\n");
            } else if (a % b == 0) {
                bw.write("multiple\n");
            } else {
                bw.write("neither\n");
            }
        }
        bw.flush();
    }
}
