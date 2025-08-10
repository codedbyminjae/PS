import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;

public class Num21610 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        // 문제 이해 확실하게
        // N * N 바구니. 각 칸엔 물의 양이 존재.
        // 구름이 격자 위를 돌아다니고, 물 복사 버그로 물을 추가로 증가
        // M개의 명령을 순서대로 수행
        // 모든 명령 후 남은 물의 총합 출력

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        int[][] water = new int[N][N];

        // 연습할 비바라기 공간 입력
        for (int r = 0; r < N; r++) {
            String[] row =  br.readLine().split(" ");
            for (int c = 0; c < N; c++) {
                water[r][c] = Integer.parseInt(row[c]);
            }
        }

        // M개의 명령어 입력
        // 0번째는 d, 1번째는 s
        int[][] cmd = new int[M][2];
        // 여기까지 입력값 끝
        for (int i = 0; i < M; i++) {
            String[] ds = br.readLine().split(" ");
            int d = Integer.parseInt(ds[0]);
            int s = Integer.parseInt(ds[1]);
            cmd[i][0] = d;
            cmd[i][1] = s;
        }

        // 명령어 1개 입력시 수행 목록 정리
        // 1. 구름 이동, 2. 비 내리기, 3. 구름 소멸, 4. 물 복사 버그, 5. 새 구름 생성
        // 모든 명령을 순서대로 수행하기에, 순서 중요하게 생각
        Queue<int[]> clouds = new ArrayDeque<>();
        // 고정된 구름 좌표 삽입
        clouds.offer (new int[]{N - 1, 0});
        clouds.offer (new int[]{N - 1, 1});
        clouds.offer (new int[]{N - 2, 0});
        clouds.offer (new int[]{N - 2, 1});

        // d의 방향키 설정
        int[] dr = {0,  0, -1, -1,  0,  1,  1,  1};
        int[] dc = {0, -1, -1,  0,  1,  1,  0, -1};

        for (int i = 0; i < M; i++) {
            int d = cmd[i][0];
            int s = cmd[i][1];

            boolean[][] visited = new boolean[N][N];

            // 1. 구름 이동
            int cloudNum = clouds.size();
            for (int j = 0; j < cloudNum; j++) {
                // 현재의 구름 좌표 꺼내기
                int[] cur = clouds.poll();
                int r = cur[0];
                int c = cur[1];

                // 모든 구름이 d방향으로 s칸 이동
                // % 보정 필요 이 부분은 정답 코드 참조
                int nr = (r + dr[d] * s) % N;
                int nc = (c + dc[d] * s) % N;

                // 구름이 있는 칸 물의 양 1 증가
                water[nr][nc]++;

                // 방문 처리해서 구름 재방문 막음
                visited[nr][nc] = true;
            }
            // 4단계 물복사 버그를 위한 대각선 방향 추가
            int[] diagR = {-1, -1, 1, 1};
            int[] diagC = {-1, 1, 1, -1};

            // 4. 물 복사 버그
            for (int r = 0; r < N; r++) {
                for (int c = 0; c < N; c++) {
                    if (visited[r][c]) { // 이번 턴에 구름이 있었던 칸만
                        int count = 0;
                        for (int k = 0; k < 4; k++) { // 대각선 4방
                            int nr = r + diagR[k];
                            int nc = c + diagC[k];
                            // 범위 안에 있고, 물이 1 이상이면 카운트
                            if (nr >= 0 && nr < N && nc >= 0 && nc < N && water[nr][nc] > 0) {
                                count++;
                            }
                        }
                        water[r][c] += count; // 카운트만큼 현재 칸 물 추가
                    }
                }
            }
            
            // 5. 새 구름 생성
            for (int r = 0; r < N; r++) {
                for (int c = 0; c < N; c++) {
                    if (!visited[r][c] && water[r][c] >= 2) {
                        clouds.offer(new int[]{r, c});
                        water[r][c] = water[r][c] - 2;
                    }
                }
            }


        }
        // 모든 명령 수행 후 남은 물 계산
        int sum = 0;
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                sum += water[r][c];
            }
        }
        bw.write(sum + "\n");
        bw.flush();


    }
}
