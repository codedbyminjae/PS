import java.io.*;

public class Num2501v1 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String[] str = br.readLine().split(" ");

        int p = Integer.parseInt(str[0]);
        int q = Integer.parseInt(str[1]);

        int count = 0;

        for (int i = 1; i <= p; i++) {
            if (p % i == 0) {
                count++;

                if (count == q) {
                    bw.write(i + "\n");
                    bw.flush();
                    return;
                }
            }
        }
        bw.write("0");
        bw.flush();

    }
}
