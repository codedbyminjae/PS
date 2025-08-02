import java.io.*;

public class Num1003 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int T =  Integer.parseInt(br.readLine());

        int[][] dp = new int[41][2];

        // 초기값 선언후에 점화식 생성
        dp[0][0] = 1;
        dp[0][1] = 0;

        dp[1][0] = 0;
        dp[1][1] = 1;

        // 이전까지의 0의 개수와 1의 개수를 더하는 과정.
        // 2개의 빈칸을 생성해서 3번째부터 이용하는 DP 고정관념
        for (int i =2; i <= 40; i++) {
            dp[i][0] = dp[i-1][0] + dp[i-2][0];
            dp[i][1] = dp[i-1][1] + dp[i-2][1];
        }

        for (int t = 0; t < T; t++) {
            int n = Integer.parseInt(br.readLine());
            bw.write(dp[n][0] + " " + dp[n][1] + "\n");
        }
        bw.flush();
    }
}
