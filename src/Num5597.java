import java.io.*;

public class Num5597 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        boolean[] check = new boolean[31];

        for (int i = 0; i < 28; i++) {
            int x = Integer.parseInt(br.readLine());
            check[x] = true;
        }

        for (int i = 1; i < check.length; i++) {
            if (check[i] == false) {
                bw.write(i + "\n");
            }
        }
        bw.flush();
    }
}