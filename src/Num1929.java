import java.io.*;

public class Num1929 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        String[] input = br.readLine().split(" ");
        int M = Integer.parseInt(input[0]);
        int N = Integer.parseInt(input[1]);

        // 소수 판별용 배열 생성
        boolean[] isNotPrime = new boolean[N + 1];
        // 0과 1은 소수가 아니므로 선행처리
        isNotPrime[0] = true;
        isNotPrime[1] = true;

        // 핵심 아이디어 : 2부터 루트 N까지만 보는 방법
        // N의 약수는 루트 N을 기준으로 대칭
        // i가 소수이면 그 배수들은 모두 소수가 아니다 <- Key Point
        // 만약 모든 경우를 돈다면 시간초과
        for (int i = 2; i * i <= N; i++) {
            if (!isNotPrime[i]) {
                // i제곱으로 시작하여서 불필요한 중복 연산 제외 (i * 2, i * 3 등)
                for (int j = i * i; j <= N; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }

        for (int i = M; i <= N; i++) {
            if (!isNotPrime[i]) {
                // 출력
                bw.write(i + "\n");
            }
        }

        bw.flush();
    }
}
