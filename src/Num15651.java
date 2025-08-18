import java.io.*;

public class Num15651 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int M;
    static int[] arr;
    public static void main(String[] args) throws IOException {

        String[] first =  br.readLine().split(" ");
        N  = Integer.parseInt(first[0]);
        M  = Integer.parseInt(first[1]);

        arr = new int[N];

        dfs(0);
        bw.flush();
    }

    public static void dfs(int depth) throws IOException {
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                bw.write(arr[i] + " ");
            }
            bw.write("\n");
            return;
        }

        for (int i = 1; i <= N; i++) {
            arr[depth] = i;
            dfs(depth + 1);
        }
    }
}
