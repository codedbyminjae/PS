import java.io.*;

public class Num11047 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        String[] input = br.readLine().split(" ");

        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        int[] coin = new int[N];
        for (int i = 0; i < N; i++) {
            coin[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;

        for (int i = N -1; i >= 0; i--) {
            if (coin[i] <= K) {
                count = count + K / coin[i];
                K = K % coin[i];
            }
        }

        bw.write(count + "\n");
        bw.flush();
    }
}
