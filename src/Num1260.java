import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Num1260 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        String[] input = br.readLine().split(" ");

        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int V = Integer.parseInt(input[2]);

        // 정점 채우기
        ArrayList<Integer>[] graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        // 간선 입력
        for (int i = 0; i < M; i++) {
            String[] edge = br.readLine().split(" ");
            int u = Integer.parseInt(edge[0]);
            int v = Integer.parseInt(edge[1]);

            // 양방향 연결
            graph[u].add(v);
            graph[v].add(u);
        }

        // 정점 번호 오름차순 정렬
        for (int i = 1; i <= N; i++) {
            graph[i].sort(null);
        }

        visited = new boolean[N + 1];
        dfs (V, graph);
        bw.newLine();

        bfs (V, graph);
        bw.newLine();
        bw.flush();
    }

    // DFS
    public static void dfs(int node, ArrayList<Integer>[] graph) throws IOException {
        visited[node] = true;
        bw.write(node + " ");

        for (int next : graph[node]) {
            if (!visited[next]) {
                dfs(next, graph);
            }
        }
    }

    // BFS
    public static void bfs (int start, ArrayList<Integer>[] graph) throws IOException {
        boolean[] visited = new boolean[graph.length];
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            bw.write(current + " ");

            for (int next : graph[current]) {
                if (!visited[next]) {
                    queue.offer(next);
                    visited[next] = true;
                }
            }
        }
    }

}
