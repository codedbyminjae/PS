import java.io.*;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Num5567 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        // 총 학생 수, 친구 관계 수
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        // 인접행렬, 학번 입력이기에 +1
        int[][] map = new int[n+1][n+1];
        boolean[] visited = new boolean[n+1];

        for (int i = 0; i < m; i++) {
            String[] friends = br.readLine().split(" ");
            int a = Integer.parseInt(friends[0]);
            int b = Integer.parseInt(friends[1]);

            // 인접 행렬 선언
            map[a][b] = 1;
            map[b][a] = 1;
        }

        int count = 0;

        // 상근이 자신은 방문 처리
        visited[1] = true;
        // 상근이 직계 친구
        for (int i = 1; i <= n; i++) {
            if (map[1][i] == 1) {
                // 상근이 친구 방문 처리
                visited[i] = true;
                count++;
            }
        }
        // 상근이 친구의 친구 탐색
        // 직접 친구 중에서 인접행렬에 연결되어 있는 수 찾기. visited로 중복 제거
        for (int i = 1; i <= n; i++) {
            if (map[1][i] == 1) {
                for (int j = 1; j <= n; j++) {
                    // 상근이 친구의 친구인데, 초대 안되었으면
                    if (!visited[j] && map[i][j] == 1) {
                        visited[j] = true;
                        count++;
                    }
                }
            }
        }

        bw.write(count + "\n");
        bw.flush();
    }
}
