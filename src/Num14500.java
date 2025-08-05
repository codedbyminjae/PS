import java.io.*;

public class Num14500 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int[][] map;

    public static void main(String[] args) throws IOException {

        String[] firstLine = br.readLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);
        int M = Integer.parseInt(firstLine[1]);

        map = new int[N][M];

        for (int i = 0; i < N; i++) {
            String[] row = br.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(row[j]);
            }
        }

        int max = 0;

        // 입력받은 전체 map 순회
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {

                // ㅡ 모양 (가로)
                if (j + 3 < M) {
                    int sum = map[i][j] + map[i][j+1] + map[i][j+2] + map[i][j+3];
                    max = Math.max(max, sum);
                }

                // ㅣ 모양 (세로)
                if (i + 3 < N) {
                    int sum = map[i][j] + map[i+1][j] + map[i+2][j] + map[i+3][j];
                    max = Math.max(max, sum);
                }

                // ㅁ 모양 (정사각형)
                if (i + 1 < N && j + 1 < M) {
                    int sum = map[i][j] + map[i+1][j] + map[i][j+1] + map[i+1][j+1];
                    max = Math.max(max, sum);
                }

                // ㄴ. 세로 3칸 + 오른쪽 1칸
                if (i + 2 < N && j + 1 < M) {
                    int sum = map[i][j] + map[i+1][j] + map[i+2][j] + map[i+2][j+1];
                    max = Math.max(max, sum);
                }

                // ㄴ. 세로 3칸 + 왼쪽 1칸
                if (i + 2 < N && j - 1 >= 0) {
                    int sum = map[i][j] + map[i+1][j] + map[i+2][j] + map[i+2][j-1];
                    max = Math.max(max, sum);
                }

                // ㄴ. 가로 3칸 + 아래 1칸
                if (i + 1 < N && j + 2 < M) {
                    int sum = map[i][j] + map[i][j+1] + map[i][j+2] + map[i+1][j+2];
                    max = Math.max(max, sum);
                }

                // ㄴ. 가로 3칸 + 아래 왼쪽 1칸
                if (i + 1 < N && j + 2 < M) {
                    int sum = map[i][j] + map[i][j+1] + map[i][j+2] + map[i+1][j];
                    max = Math.max(max, sum);
                }

                // ㄴ. 세로 3칸 + 왼쪽 위로 꺾임
                if (i + 2 < N && j + 1 < M) {
                    int sum = map[i][j+1] + map[i+1][j+1] + map[i+2][j+1] + map[i+2][j];
                    max = Math.max(max, sum);
                }

                // ㄴ. 세로 3칸 + 오른쪽 위로 꺾임
                if (j - 1 >= 0 && i + 2 < N) {
                    int sum = map[i][j-1] + map[i+1][j-1] + map[i+2][j-1] + map[i+2][j];
                    max = Math.max(max, sum);
                }

                // ㄴ. 가로 3칸 + 위로 꺾임 (맨 오른쪽 위)
                if (i - 1 >= 0 && j + 2 < M) {
                    int sum = map[i][j] + map[i][j+1] + map[i][j+2] + map[i-1][j+2];
                    max = Math.max(max, sum);
                }

                // ㄴ. 가로 3칸 + 위로 꺾임 (맨 왼쪽 위)
                if (i - 1 >= 0 && j + 2 < M) {
                    int sum = map[i][j] + map[i][j+1] + map[i][j+2] + map[i-1][j];
                    max = Math.max(max, sum);
                }

                // Z모양 총 4가지
                // z형 가로
                if (i + 1 < N && j + 2 < M) {
                    int sum = map[i][j] + map[i][j+1] + map[i+1][j+1] + map[i+1][j+2];
                    max = Math.max(max, sum);
                }

                // s형 가로
                if (i + 1 < N && j + 2 < M) {
                    int sum = map[i][j+1] + map[i][j+2] + map[i+1][j] + map[i+1][j+1];
                    max = Math.max(max, sum);
                }

                // z형 세로
                if (j - 1 >= 0 && i + 2 < N) {
                    int sum = map[i][j] + map[i+1][j] + map[i+1][j-1] + map[i+2][j-1];
                    max = Math.max(max, sum);
                }

                // s형 세로
                if (i + 2 < N && j + 1 < M) {
                    int sum = map[i][j] + map[i+1][j] + map[i+1][j+1] + map[i+2][j+1];
                    max = Math.max(max, sum);
                }

                // ㅗ 모양 정리
                // ㅜ 모양 (가로 + 아래가 튀어나온 경우)
                if (i + 1 < N && j + 2 < M) {
                    int sum = map[i][j] + map[i][j+1] + map[i][j+2] + map[i+1][j+1];
                    max = Math.max(max, sum);
                }

                // ㅗ 모양 (가로 + 위가 튀어나온 경우)
                if (i - 1 >= 0 && j + 2 < M) {
                    int sum = map[i][j] + map[i][j+1] + map[i][j+2] + map[i-1][j+1];
                    max = Math.max(max, sum);
                }

                // ㅏ 모양 (세로 + 우측으로 튀어나온 경우)
                if (i + 2 < N && j + 1 < M) {
                    int sum = map[i][j] + map[i+1][j] + map[i+2][j] + map[i+1][j+1];
                    max = Math.max(max, sum);
                }

                // ㅓ 모양 (세로 + 좌측으로 튀어나온 경우)
                if (j - 1 >= 0 && i + 2 < N) {
                    int sum = map[i][j] + map[i+1][j] + map[i+2][j] + map[i+1][j-1];
                    max = Math.max(max, sum);
                }
            }
        }

        bw.write(max+"\n");
        bw.flush();
        bw.close();
    }
}
