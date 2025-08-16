import java.io.*;

public class Num15652 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N, M;
    static int[] pick;

    public static void main(String[] args) throws IOException {
        String[] first = br.readLine().split(" ");
        N = Integer.parseInt(first[0]);
        M = Integer.parseInt(first[1]);

        pick = new int[M];
        dfs(1, 0);
        bw.flush();
    }

    static void dfs (int start, int depth) throws IOException {
        if (depth == M) {
            for (int k = 0; k < M; k++) {
                bw.write(pick[k] +(k + 1 == M ? "\n" : " "));
            }
            return;
        }

        for (int i = start; i <= N; i++) {
            pick[depth] = i;
            dfs(i, depth + 1);
        }
    }
}
