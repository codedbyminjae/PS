import java.io.*;
import java.util.Arrays;

public class Num15666  {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N, M;
    static int[] nums;
    static int[] sequence;

    public static void main(String[] args) throws IOException {
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);

        nums = new int[N];
        String[] array =  br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(array[i]);
        }

        Arrays.sort(nums);
        sequence = new int[M];

        dfs(0, 0);

        bw.flush();
    }

    static void dfs(int depth, int start) throws IOException {
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                bw.write(sequence[i] + " ");
            }
            bw.write("\n");
            return;
        }

        int prev = 0; // 같은 깊이에서 중복값을 방지하는 변수
        for (int i = start; i < N; i++) {
            if (nums[i] == prev) { // 같은값이면 건너뛰기, prev는 매 깊이마다 독립 중복제거
                continue;
            }
            sequence[depth] = nums[i];
            dfs(depth + 1, i); // i를 그대로 전달해야 다음에도 재사용
            prev = nums[i];
        }
    }
}
