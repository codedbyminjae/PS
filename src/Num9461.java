import java.io.*;

public class Num9461 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int T =  Integer.parseInt(br.readLine());

        int[] padovan = new int[T];

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            padovan[i] = n;
        }

        // 오버플로우 방지를 위해 long 타입을 사용
        long[] dp = new long[101];

        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;
        dp[4] = 2;
        dp[5] = 2;
        for (int i = 6; i <= 100; i++) {
            dp[i] = dp[i - 1] + dp[i - 5];
        }

        for (int i = 0; i < T; i++) {
            bw.write(dp[padovan[i]] + "\n");
        }
        bw.flush();
    }
}
