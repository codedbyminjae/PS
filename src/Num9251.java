import java.io.*;

public class Num9251 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        // 최장 공통 부분 수열의 길이 출력
        // 부분 문자열이 아닌, 부분 수열 (연속할 필요는 없지만, 순서는 보장)

        String first = " " + br.readLine();
        String second = " " + br.readLine();

        char[] s1 = first.toCharArray();
        char[] s2 = second.toCharArray();

        // DP
        int n = s1.length - 1;
        int m = s2.length - 1;

        int[][] dp = new int[n+1][m+1];

        // 0으로 초기화된 dp배열에 문자열이 같은 경우 1 증가.
        // 아닌 경우는 그 이전의 값중에서 큰 값으로 갱신
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s1[i] == s2[j]) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else if (s1[i] != s2[j]) { // 위쪽과 좌측의 값중에서 비교해서 값 대입
                    if (dp[i-1][j] > dp[i][j-1]) {
                        dp[i][j] = dp[i-1][j];
                    } else {
                        dp[i][j] = dp[i][j-1];
                    }
                }
            }
        }
        bw.write(dp[n][m]+"\n");
        bw.flush();
    }
}
