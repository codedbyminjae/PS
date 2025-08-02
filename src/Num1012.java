import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Num1012 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        // M과 N의 배열 생성 / 배추가 심어져 있는 위치의 개수 K
        // 해결 방법 ->
        // 좌표를 모두 큐에 넣고, 상하좌우 탐색해서 범위내까지 순회하면 count +1
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            String[] cabbage = br.readLine().split(" ");
            // 각각 가로, 세로, 배추 위치 수
            int M = Integer.parseInt(cabbage[0]);
            int N = Integer.parseInt(cabbage[1]);
            int K = Integer.parseInt(cabbage[2]);

            // 가로 = 열, 세로 = 행
            int[][] map =  new int[N][M];
            boolean[][] visited = new boolean[N][M];

            Queue<int[]> inputQueue = new LinkedList<int[]>();

            // 배추 위치
            for (int i = 0; i < K; i++) {
                String[] row = br.readLine().split(" ");
                int x = Integer.parseInt(row[0]);
                int y = Integer.parseInt(row[1]);
                // (x, y)이지만 map[행][열] 이기에 반대로 입력
                map[y][x] = 1;
                // 입력받은 좌표를 모두 intputQueque에 넣기
                inputQueue.offer(new int[]{y, x});
            }

            int[] dx = {-1, 1, 0, 0};
            int[] dy = {0, 0, -1, 1};

            int count = 0;

            // inputQueue 큐에 들어간 좌표를 모두 순회
            while (!inputQueue.isEmpty()) {
                int[] start = inputQueue.poll();
                // sy, sx는 큐에 들어가있는 좌표
                int sy = start[0];
                int sx = start[1];

                // 방문 처리 되었는지 확인.
                // visited의 default 값은 false.
                // 이 코드가 없으면 주변 탐색 오류 발생
                // 이 코드가 없으면 주변 탐색 오류 발생. ex) 중복 탐색
                if (visited[sy][sx] == true) {
                    continue;
                }

                // 새로운 큐 생성. 앞서 꺼낸 좌표를 bfsQueue에 삽입
                Queue<int[]> bfsQueue = new LinkedList<>();
                bfsQueue.offer(new int[]{sy, sx});
                visited[sy][sx] = true;

                // 한 무리 탐색 시작
                while (!bfsQueue.isEmpty()) {
                    int[] current = bfsQueue.poll();
                    int y = current[0];
                    int x = current[1];

                    for (int d = 0; d < 4; d++) {
                        int ny = y + dy[d];
                        int nx = x + dx[d];

                        if (ny < 0 || ny >= N || nx < 0 || nx >= M) {
                            continue;
                        }

                        if (map[ny][nx] == 1 && !visited[ny][nx]) {
                            visited[ny][nx] = true;
                            bfsQueue.offer(new int[]{ny, nx});
                        }
                    }
                }
                // BFS 한 번이 끝났다는 건 하나의 배추 무리 탐색이 끝났다는 뜻이므로 count++
                count++;
            }
            bw.write(count + "\n");
        }
        bw.flush();
    }
}
