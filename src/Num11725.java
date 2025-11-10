import java.io.*;
import java.util.*;

public class Num11725 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());
        List<Integer>[] graph = new ArrayList[N + 1];

        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < N - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }

        boolean[] visited = new boolean[N + 1];
        int[] parent = new int[N + 1];
        Queue<Integer> queue = new LinkedList<>();

        visited[1] = true;
        queue.add(1);

        while (!queue.isEmpty()) {
            int cur = queue.poll();
            for (int next : graph[cur]) {
                if (!visited[next]) {
                    visited[next] = true;
                    parent[next] = cur;
                    queue.add(next);
                }
            }
        }

        for (int i = 2; i <= N; i++) {
            bw.write(parent[i] + "\n");
        }
        bw.flush();
    }
}
