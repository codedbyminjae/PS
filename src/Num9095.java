import java.io.*;

public class Num9095 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int T =  Integer.parseInt(br.readLine());

        int[] dp = new int[12];

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for (int i = 4; i <= 11; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }

        for (int t = 0; t < T; t++) {
            int n = Integer.parseInt(br.readLine());
            bw.write(dp[n] + "\n");
        }
        bw.flush();

    }
}
