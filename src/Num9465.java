import java.io.*;
import java.nio.Buffer;

public class Num9465 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int T =  Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {

            int N = Integer.parseInt(br.readLine());

            // 처음 만들때 부터 열에 +1을 해줘서 위치하는 열을 직관적으로 유도
            int[][] ssil =  new int[2][N+1];

            // 스티커 행렬 입력 기준은 공백
            for (int j = 0; j < 2; j++) {
                String[] row =  br.readLine().split(" ");
                for (int k = 1; k <= N; k++) {
                    ssil[j][k] = Integer.parseInt(row[k-1]);
                }
            }

            // dp 시작부분
            // dp 알고리즘은 힌트 보고 참조해서 완성
            // 크로스로 더해나가고, 그 전의 열값까지 생각해 "최적의 점수 경로" 고려
            // 그림 이해가 더 빠름
            int[][] dp = new int[2][N+1];
            // l의 경우를 나누어 주지 않으면 열에서 음수값이 나와서 컴파일 에러
            for (int l = 1; l <= N; l++) {
                if (l == 1) {
                    dp[0][l] = ssil[0][l];
                    dp[1][l] = ssil[1][l];
                } else {
                    dp[0][l] = Math.max(dp[1][l - 1], dp[1][l - 2]) + ssil[0][l];
                    dp[1][l] = Math.max(dp[0][l - 1], dp[0][l - 2]) + ssil[1][l];
                }
            }
            bw.write(Math.max(dp[0][N], dp[1][N])+"\n");
        }
        bw.flush();
    }
}
