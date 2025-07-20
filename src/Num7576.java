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
        // 높이 추가
        int H =  Integer.parseInt(numbers[2]);

        // 토마토 박스 배열 생성, 큐 생성
        // 3차원 배열 생성, 층/행/열
        // 알고리즘 처리는 H개의 2차원 배열로
        int[][][] tomato = new int[H][N][M];
        Queue<int[]> queue = new LinkedList<>();

        // 입력 높이만큼 입력받아야 하기에 3중 for문으로 변경
        for (int h = 0; h < H; h++) {
            for (int i = 0; i < N; i++) {
                String[] low = br.readLine().split(" ");
                for (int j = 0; j < M; j++) {
                    tomato[h][i][j] = Integer.parseInt(low[j]);

                    // 입력과 동시에 익은 토마토 확인
                    if (tomato[h][i][j] == 1) {
                        queue.offer(new int[]{h, i, j});
                    }
                }
            }
        }

        // 토마토 상자 상하좌우 순회, 각 층 내부에서만
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
                int z = current[0];
                int x = current[1];
                int y = current[2];

                // 현재 익은 토마토 기준으로 상하좌우 탐색
                for (int dir = 0; dir < 4; dir++) {
                    int nx =  x + dx[dir];
                    int ny =  y + dy[dir];

                    // 탐색 좌표가 배열 범위 바깥이면 continue;
                    if (nx < 0 || ny < 0 || nx >= N || ny >= M) {
                        continue;
                    }

                    // 안익은 토마토라면, 익은 토마토로 바꾸고, 해당 좌표 큐에 추가
                    if (tomato[z][nx][ny] == 0 ) {
                        tomato[z][nx][ny] = 1;
                        queue.add(new int[]{z, nx, ny});
                    }
                }

                // 전 층의 좌표가 익은 토마토인 경우
                // 해당 좌표 윗 층의 토마토를 익히는 과정
                if (z + 1 < H && tomato[z+1][x][y] == 0) {
                    tomato[z+1][x][y] = 1;
                    queue.add(new int[]{z+1, x, y});
                }

                // 아래층 토마토 익히는 과정
                if (z -1 >= 0 && tomato[z-1][x][y] == 0) {
                    tomato[z-1][x][y] = 1;
                    queue.add(new int[]{z-1, x, y});
                }
            }
        }

        // 모든 BFS 종료 후, 익지 않은 토마토 확인 -> 예외 처리
        // 높이가 추가 되었으므로 for문을 한줄 더 추가해서 순회
        boolean visited = false;

        for (int z = 0; z < H; z++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (tomato[z][i][j] == 0) {
                        // 안 익은 토마토 발견 -> visited값 변경
                        visited = true;
                        break;
                    }
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
