import java.io.*;
import java.util.Arrays;

public class Num15663 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    static int N, M;
    static int[] nums; // 입력받은 N개의 수
    static int[] sequance; // 현재 수열
    static boolean[] used; // 사용 여부

    public static void main(String[] args) throws IOException {
        // 입력
        String[] input =  br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);

        // N개의 수 입력
        nums = new int[N];
        String[] arr = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(arr[i]);
        }

        // 정렬
        Arrays.sort(nums);

        // 배열 초기화 <- 이 과정이 필수
        sequance = new int[M];
        used = new boolean[N];

        // 백트래킹
        backtrack(0);

        bw.write(sb.toString());
        bw.flush();
    }

    static void backtrack(int depth) {
        // 수열이 완성된 경우 - 종료 조건
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                sb.append(sequance[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        int lastUsed = -1;
        for (int i = 0; i < N; i++) {
            if (!used[i] && nums[i] != lastUsed) {
                used[i] =  true;
                sequance[depth] = nums[i];
                lastUsed = nums[i]; // 현재 사용한 숫자를 기록해서 중복방지
                backtrack(depth + 1);
                used[i] = false; // 원상 복구
            }
        }
    }
}
