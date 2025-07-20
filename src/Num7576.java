import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Num7576 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    // 주의 : 문제 입력은 [가로(열)=M, 세로(행)=N] 순서이므로, 배열 선언은 [N][M]로 해야 함!
    public static void main(String[] args) throws IOException {
        String[] numbers =  br.readLine().split(" ");
        int M =  Integer.parseInt(numbers[0]);
        int N =  Integer.parseInt(numbers[1]);

        // 토마토 박스 배열 생성, 큐 생성
        int[][] tomato = new int[N][M];
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            String[] row = br.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                tomato[i][j] = Integer.parseInt(row[j]);

                // 익은 토마토인 경우에 큐 삽입
                if (tomato[i][j] == 1) {
                    queue.add(new int[]{i, j});
                }
            }
        }

        // 토마토 상자 상하좌우 순회
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        // 모두 익지 못하는 값으로 default
        int day = -1;

        // 하루 단위로 BFS 탐색 진행 : 현재 큐에 있는 좌표는 같은 날에 익는 토마토
        // while문이 한번 순회 했다는 의미 -> day +1
        while (!queue.isEmpty()) {
            int size = queue.size();
            day++;

            for (int i = 0; i < size; i++) {
                int[] current = queue.poll();
                int x = current[0];
                int y = current[1];

                // 현재 익은 토마토 기준으로 상하좌우 탐색
                for (int dir = 0; dir < 4; dir++) {
                    int nx =  x + dx[dir];
                    int ny =  y + dy[dir];

                    // 탐색 좌표가 배열 범위 바깥이면 continue;
                    if (nx < 0 || ny < 0 || nx >= N || ny >= M) {
                        continue;
                    }

                    // 안익은 토마토라면, 익은 토마토로 바꾸고, 해당 좌표 큐에 추가
                    if (tomato[nx][ny] == 0 ) {
                        tomato[nx][ny] = 1;
                        queue.add(new int[]{nx, ny});
                    }
                }
            }
        }

        // 모든 BFS 종료 후, 익지 않은 토마토 확인 -> 예외 처리
        boolean visited = false;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (tomato[i][j] == 0) {
                    visited = true;
                    break;
                }
            }
        }

        if (visited) {
            bw.write("-1" + "\n");
        } else {
            bw.write(day + "\n");
        }
        bw.flush();
    }
}
