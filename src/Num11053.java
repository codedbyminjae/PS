import java.io.*;

public class Num11053 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        // LIS = Longest Increasing Subsequence, 가장 긴 증가하는 부분 수열
        int N = Integer.parseInt(br.readLine());
        int[] A =  new int[N];

        String[] input = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(input[i]);
        }

        int[] dp = new int[N];
        int count = 0;
        
        // 부분 수열은 건너뛰어서 count 가능
        // A[j] < A[i] 조건 누락
        // 전체 배열 중 최댓값을 구해야 함

        for (int i = 0; i < N; i++) {
            dp[i] = 1; // 처음은 0으로 초기화 => TC 오류
            // 하지만, gpt "나 혼자만 뽑는 부분 수열"또한 유효값이기에 1이 정석
            for (int j = 0; j < i; j++) {
                if (A[j] < A[i]) { // 해당 조건이 없으면 증가하지 않는 경우에도 dp값 갱신 + "=" 이 없어야 중복되는 수열도 건너뛰고 count 증가
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            count = Math.max(count, dp[i]);
        }

        bw.write(count + "\n");
        bw.flush();
    }
}
