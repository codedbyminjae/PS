import java.io.*;

public class Num12865 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String[] first = br.readLine().split(" ");
        // 물건의 개수 N, 배낭 최대 무게 K
        int N = Integer.parseInt(first[0]);
        int K = Integer.parseInt(first[1]);

        int[] weight = new int[N + 1];
        int[] value = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            String[] input = br.readLine().split(" ");
            // i번째 무게와 가치 저장
            weight[i] = Integer.parseInt(input[0]);
            value[i] = Integer.parseInt(input[1]);
        }

        int[][] dp = new int[N + 1][K + 1];

        // 보유 물건 모두 순회
        for (int i = 1; i <= N; i++) {
            // 배낭 무게를 점차 증가시켜서 DP배열 채우기
            for (int j = 1; j <= K; j++) {
                // 물건을 넣을 수 있다면,
                // 물건을 넣지 않는 경우와, 현재 물건을 넣는 경우 중 큰 가치 선택
                // + value[i] <- 해당 코드가 점화식의 킥
                // 물건을 넣기 전까지의 최고 가치에서 실제로 넣었을 때의 이득을 갱신시켜준다.
                if (weight[i] <= j) {
                    dp[i][j] = Math.max(dp[i-1][j-weight[i]] + value[i], dp[i-1][j]);
                } else {
                    // 위 조건 불만족시, 물건을 넣지 않으므로, 이전 값 선택
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        // 가장 최대 가치 값 출력
        bw.write(dp[N][K] + "\n");
        bw.flush();

    }
}
