import java.io.*;
import java.util.*;

public class Num11725 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
 
        int N = Integer.parseInt(br.readLine()); // 정수 입력
        List<Integer>[] graph = new ArrayList[N + 1]; // 그래프 선언, 인접 노드 즉 연결 노드를 저장하기 위해 리스트 선언

        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < N - 1; i++) { // 트리는 간선이 N-1개, 무방향 = 양방향, 모든 정점 연결
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }

        boolean[] visited = new boolean[N + 1]; // 방문 여부 판단 배열
        int[] parent = new int[N + 1]; // 정답 배열
        Queue<Integer> queue = new LinkedList<>(); // 큐

        // BFS 초기화, 루트 1로 고정
        visited[1] = true;
        queue.add(1);

        while (!queue.isEmpty()) {
            int cur = queue.poll(); // 큐에서 꺼내고
            for (int next : graph[cur]) { // 연결된 노드 확인 iter로 사기 코드
                if (!visited[next]) { // 아직 안가본 노드이면
                    visited[next] = true; // 방문 표시
                    parent[next] = cur; // 부모를 기록하는 부분
                    queue.add(next); // 큐에넣기
                }
            }
        }

        for (int i = 2; i <= N; i++) {
            bw.write(parent[i] + "\n"); // 2번노드부터 부모를 출력
        }
        bw.flush();
    }
}
