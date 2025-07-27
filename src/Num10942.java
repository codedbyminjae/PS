import java.io.*;
import java.util.*;

public class Num10942 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();
        String[] numbers = br.readLine().split(" ");

        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(numbers[i]));
        }

        // DP 순회 조건문
        boolean[][] dp = new boolean[N][N];

        // length = 1
        for (int i = 0; i < N; i++) {
            dp[i][i] = true;
        }

        // length = 2
        for (int i = 0; i < N - 1; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                dp[i][i+1] = true;
            }
        }

        // length >= 3 도움 받은 코드
        for (int len = 3; len <= N; len++) {
            // 구간 시작 위치 설정
            for (int start = 0; start <= N - len; start++) {
                // 구간 종료 위치. -1의 의미는 리스트에서의 인덱스가 0부터 시작
                int end = start + len - 1;

                // 구간의 시작과 끝이 같은지. 안쪽 구간이 팰린드롬인지 (이전 길이가 2인 코드값을 활용)
                if (list.get(start).equals(list.get(end)) && dp[start + 1][end -1] == true) {
                    dp[start][end] = true;
                }
            }
        }

        int M = Integer.parseInt(br.readLine());

        for (int i = 0; i < M; i++) {
            String[] numbers_2 = br.readLine().split(" ");
            int start = Integer.parseInt(numbers_2[0]) - 1;
            int end = Integer.parseInt(numbers_2[1]) - 1;

            if (dp[start][end]) {
                bw.write("1" + "\n");
            } else {
                bw.write("0" + "\n");
            }
        }
        bw.flush();
    }
}
