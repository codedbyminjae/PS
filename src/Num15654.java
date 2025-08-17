import java.io.*;
import java.util.Arrays;

public class Num15654 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N, M;
    static int[] nums;
    static int[] pick;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {

        String[] first =  br.readLine().split(" ");
        N = Integer.parseInt(first[0]);
        M = Integer.parseInt(first[1]);

        nums = new int[N];
        String[] second = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(second[i]);
        }

        Arrays.sort(nums); // 사전 정렬

        pick = new int[M];
        visited = new boolean[N];

        dfs(0);
        bw.flush();
    }

    static void dfs(int depth) throws IOException {
        // 종료 조건
        if (depth == M) {
            for (int k = 0; k < M; k++) {
                bw.write(pick[k] + (k + 1 == M ? "\n" : " "));
            }
            return;
        }
        
        // 작은값 부터 순회, 사전 정렬한 배열을 이용
        for (int i = 0; i < N; i++) {
            // 이미 선택한 숫자는 사용 X
            if (visited[i]) {
                continue;
            }

            visited[i] = true;
            pick[depth] = nums[i];
            dfs(depth + 1);
            visited[i] = false; // 원상복구 (백트래킹을 위해)
        }
    }
}
