import java.io.*;

public class Num3052 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        boolean[] check = new boolean[42];

        int count = 0;

        for (int i = 0; i < 10; i++) {
            int n = Integer.parseInt(br.readLine());
            int remain = n % 42;
            if (!check[remain]) {
                check[remain] = true;
                count++;
            }
        }
        bw.write(count + "\n");
        bw.flush();
    }
}