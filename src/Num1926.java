import java.util.*;

// 1. 도화지 크기 입력 받기.
// 2. 방문 여부 확인하는 배열 생성.
// 3. 전체 도화지 탐색, 시작 위치 생각.
// 4. BFS나 DFS로 하나의 그림을 탐색하면서 넓이 확인.
// 5. 그림 개수 증가, 넓이 최댓값 갱신
public class Num1926 {

    static int n, m;
    static int[][] map;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 도화지 크기 입력
        n = in.nextInt();
        m = in.nextInt();

        map = new int[n][m];

        // 세로 크기 먼저, 그 다음 가로 크기 입력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = in.nextInt();
            }
        }

        /*
        System.out.println("입력 확인");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        */

        boolean[][] visited = new boolean[n][m];

        int count = 0;
        int maxSize = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    count++;
                    int size = bfs(i, j, visited);
                    maxSize = Math.max(maxSize, size);
                }
            }
        }

        System.out.println(count);
        System.out.println(maxSize);
    }
    // 그림 하나의 넓이를 계산하는 BFS 함수
    static int bfs(int x, int y, boolean[][] visited) {
        Queue<int[]> queue = new LinkedList<int[]>(); // 큐 생성
        queue.add(new int[]{x, y}); // 좌표를 큐에 추가
        visited[x][y] = true; // 방문처리
        int size = 1; // 시작 좌표 그림이므로 넓이에 포함.

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        while (!queue.isEmpty()) { // 큐가 빌때까지 무한루프
            int[] current = queue.poll(); // poll은 큐에서 꺼내면서 제거
            int cx = current[0];
            int cy = current[1];

            for (int dir = 0; dir < 4; dir++) {
                int nx = cx + dx[dir];
                int ny = cy + dy[dir];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                    if (!visited[nx][ny] && map[nx][ny] == 1) { // 그림의 일부
                        visited[nx][ny] = true; // 방문 처리
                        queue.add(new int[]{nx, ny}); // 큐에 넣기
                        size++; // 넓이 증가
                    }
                }
            }
        }

        return size;
    }
}