import java.io.*;

public class Num2293 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        // 점화식: dp[value] += dp[value - c]
        // → "value - c원을 만드는 방법"에 "동전 c 하나를 추가"하여 value를 만든다

        // 동전의 종류 n, 목표 금액  k
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        // n개의 동전 가치 저장
        int[] coin = new int[n];
        for (int i = 0; i < n; i++) {
            coin[i] = Integer.parseInt(br.readLine());
        }

        // dp 생성
        int[] dp = new int[k + 1]; //k원까지 채워야 하기에, k+1
        dp[0] = 1;

        // 동전을 인덱스별로 꺼내어 조합에 포함. (점화식을 통해 중복 제거)
        for (int i = 0; i < n; i++) {
            // 현재 순회중인 i번째 -> 사용하려는 동전 c
            int c = coin[i];
            // value원을 만드는 방법 = value - c원을 만드는 경우에 동전 c를 추가하는 방법
            for (int value = c; value <= k; value++) {
                dp[value] = dp[value] + dp[value - c];
            }
        }

        bw.write(dp[k] + "\n");
        bw.flush();
    }
}
