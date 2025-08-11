import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;

public class Num21610 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        // N * N 바구니. 각 칸엔 물의 양이 존재.
        // 입력값 이해
        // 바구니 크기 N, 명령어 개수 M
        // d, s입력 d는 방향, s는 거리 (d는 1부터 시작하게끔 배열로 선언)
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        // 직관적으로 0행부터 시작이 아닌 1행부터 시작을 위해 +1, for문 범위도 수정
        int[][] water = new int[N + 1][N + 1];

        for (int i = 1; i <= N; i++) {
            String[] row =  br.readLine().split(" ");
            for (int j = 1; j <= N; j++) {
                water[i][j] = Integer.parseInt(row[j - 1]);
            }
        }

        // d 방향키 배열 선언, 1번부터 선언하기에 총 크기는 9, 첫자리는 공백
        // ←, ↖, ↑, ↗, →, ↘, ↓, ↙
        int[] dx = {0, 0, -1, -1, -1, 0, 1, 1, 1};
        int[] dy = {0, -1, -1, 0, 1, 1, 1, 0, -1};
        
        // 입력한 N에 따라 생성 되는 초기 구름 위치 선정
        // 순서대로 꺼내오기 위해 덱 사용
        Queue<int[]> clouds = new ArrayDeque<>();
        clouds.add(new int[]{N, 1});
        clouds.add(new int[]{N, 2});
        clouds.add(new int[]{N - 1, 1});
        clouds.add(new int[]{N - 1, 2});

        for (int i = 0; i < M; i++) {
            // d, s 입력 처리
            String[] move = br.readLine().split(" ");
            int d = Integer.parseInt(move[0]);
            int s = Integer.parseInt(move[1]);

            // 마지막 구름이 있던 칸을 제외하고, 구름을 생성하기 위해 초기 구름 위치 방문 처리
            boolean[][] isCloud = new boolean[N + 1][N + 1];

            // 1. 입력한 d, s에 따른 구름 이동, 구름의 크기는 clouds.size
            int cloudCount = clouds.size();
            for (int j = 0; j < cloudCount; j++) {
                int[] current = clouds.poll();
                int r = current[0];
                int c = current[1];
                // 구름이 이동 했을 때, 좌표가 경계선을 넘어갔으면, 맵이 이어진 상태로 간주
                // 모듈러 연산
                int nr = ((r + dx[d] * s - 1) % N + N) % N + 1;
                int nc = ((c + dy[d] * s - 1) % N + N) % N + 1;
                // 선정한 초기 구름 위치에서 water Map의 물 양 1씩 증가
                water[nr][nc]++;
                // 이동 후 구름의 위치 방문 처리
                isCloud[nr][nc] = true;

                // 현재 위치에서 물 복사 버그 수행을 위한 준비
                clouds.add(new int[]{nr, nc});

            }
            // 물복사 버그 수행
            // 각 대각선 방향의 물 양이 0이 아닌 만큼 증가. min = 0, max = 4;
            // 현 위치에서 ↖, ↗, ↙, ↘ 탐색.
            int[] dr = {-1, -1, 1, 1};
            int[] dc = {-1, 1, -1, 1};

            while (!clouds.isEmpty()) {
                int[] pos = clouds.poll();
                int r = pos[0], c = pos[1];

                int count = 0;
                for (int k = 0; k < 4; k++) {
                    int nr = r + dr[k];
                    int nc = c + dc[k];
                    if (nr >= 1 && nr <= N && nc >= 1 && nc <= N && water[nr][nc] > 0) {
                        count++;
                    }
                }
                // water 2차원 배열에 물복사 버그 후의 물의 양 까지 기입.
                water[r][c] += count;
            }

            // 새로운 구름 생성
            clouds.clear();
            for (int r = 1; r <= N; r++) {
                for (int c = 1; c <= N; c++) {
                    // 방문 되지 않았고, 물의 양이 2 이상인 곳
                    if (!isCloud[r][c] && water[r][c] >= 2) {
                        clouds.add(new int[]{r, c});
                        // 구름 생성 후, 물의 양 2 감소
                        water[r][c] = water[r][c] - 2;
                    }
                }
            }
        }
        // 남은 물 합산
        int sum = 0;
        for (int r = 1; r <= N; r++) {
            for (int c = 1; c <= N; c++) {
                sum += water[r][c];
            }
        }
        bw.write(sum + "\n");
        bw.flush();
    }
}
