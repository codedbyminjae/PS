import java.io.*;
import java.util.ArrayList;

public class Num2581 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        // M, N 입력받기
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        // 소수들을 저장할 리스트
        ArrayList<Integer> primes = new ArrayList<>();

        // M ~ N 범위 순회
        for (int num = M; num <= N; num++) {
            if (isPrime(num)) {       // num이 소수라면
                primes.add(num);      // 소수 리스트에 추가
            }
        }

        // 소수가 하나도 없으면 -1 출력
        if (primes.size() == 0) {
            bw.write("-1");
            bw.flush();
            return;
        }

        // 소수들의 합과 최솟값 구하기
        int sum = 0;
        for (int p : primes) {
            sum += p;
        }
        int min = primes.get(0);

        // 출력
        bw.write(sum + "\n" + min);
        bw.flush();
    }

    // 소수 판별 함수
    static boolean isPrime(int n) {
        // 1은 소수가 아님
        if (n == 1) return false;

        // 2는 소수
        if (n == 2) return true;

        // 짝수는 소수가 아님
        if (n % 2 == 0) return false;

        // 홀수만 √n 까지 검사
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }

        return true;
    }
}
