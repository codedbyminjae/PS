import java.io.*;

public class Num1149 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N =  Integer.parseInt(br.readLine());

        int[][] cost = new int[N][3];

        for (int i = 0; i < N; i++) {
            String[] rgb = br.readLine().split(" ");
            cost[i][0] = Integer.parseInt(rgb[0]);
            cost[i][1] = Integer.parseInt(rgb[1]);
            cost[i][2] = Integer.parseInt(rgb[2]);
        }

        int[][] dp = new int[N][3];

        dp[0][0] = cost[0][0];
        dp[0][1] = cost[0][1];
        dp[0][2] = cost[0][2];

        // 점화식 ->
        for (int i = 1; i < N; i++) {
            dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2]) + cost[i][0];
            dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2]) + cost[i][1];
            dp[i][2] = Math.min(dp[i-1][0], dp[i-1][1]) + cost[i][2];
        }

        int result = Math.min(dp[N-1][0], Math.min(dp[N-1][1], dp[N-1][2]));
        bw.write(result + "\n");
        bw.flush();
    }
}
