import java.io.*;

public class Num14500_Optimized {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    static int[][] map;
    static int N, M;
    static int max = 0;

    public static void main(String[] args) throws IOException {

        String[] firstLine = br.readLine().split(" ");
        N = Integer.parseInt(firstLine[0]);
        M = Integer.parseInt(firstLine[1]);

        for (int i = 0; i < N; i++) {
            String[] row = br.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(row[j]);
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                checkLine(i, j);
                checkSquare(i, j);
                checkL(i, j);
                checkZ(i, j);
                checkT(i, j);
            }
        }

        bw.write(max + "\n");
        bw.flush();
    }

    // Straight 모양
    static void checkLine(int i, int j) {
        if (j + 3 < M)
            max = Math.max(max, map[i][j] + map[i][j + 1] + map[i][j + 2] + map[i][j + 3]);
        if (i + 3 < N)
            max = Math.max(max, map[i][j] + map[i + 1][j] + map[i + 2][j] + map[i + 3][j]);
    }

    // 정사각혐 모양
    static void checkSquare(int i, int j) {
        if (i + 1 < N && j + 1 < M)
            max = Math.max(max, map[i][j] + map[i + 1][j] + map[i][j + 1] + map[i + 1][j + 1]);
    }

    // L모양의 시작점을 순회하는 방법을 못 찾아서, 모든 경우를 배열로 생성
    static void checkL(int i, int j) {
        int[][][] shapes = {
                // 순서대로
                // └, ┘, ┌, ┐, ┌, ┐, └, ┘
                {{0,0},{1,0},{2,0},{2,1}}, {{0,0},{1,0},{2,0},{2,-1}},
                {{0,0},{0,1},{0,2},{1,0}}, {{0,0},{0,1},{0,2},{1,2}},
                {{0,0},{1,0},{2,0},{0,1}}, {{0,0},{1,0},{2,0},{0,-1}},
                {{0,0},{0,1},{0,2},{-1,0}}, {{0,0},{0,1},{0,2},{-1,2}}
        };

        for (int s = 0; s < shapes.length; s++) {
            int sum = 0;
            boolean valid = true;
            for (int d = 0; d < 4; d++) {
                int ni = i + shapes[s][d][0];
                int nj = j + shapes[s][d][1];
                if (ni < 0 || ni >= N || nj < 0 || nj >= M) {
                    valid = false;
                    break;
                }
                sum = sum + map[ni][nj];
            }
            if (valid == true) {
                max = Math.max(max, sum);
            }
        }
    }

    static void checkZ(int i, int j) {
        int[][][] shapes = {
                {{0,0},{0,1},{1,1},{1,2}}, {{0,1},{0,2},{1,0},{1,1}},
                {{0,0},{1,0},{1,-1},{2,-1}}, {{0,0},{1,0},{1,1},{2,1}}
        };

        for (int s = 0; s < shapes.length; s++) {
            int sum = 0;
            boolean valid = true;

            for (int d = 0; d < 4; d++) {
                int ni = i + shapes[s][d][0];
                int nj = j + shapes[s][d][1];
                if (ni < 0 || ni >= N || nj < 0 || nj >= M) {
                    valid = false;
                    break;
                }
                sum = sum + map[ni][nj];
            }
            if (valid) {
                max = Math.max(max, sum);
            }
        }
    }

    static void checkT(int i, int j) {
        int[][][] shapes = {
                {{0,0},{0,1},{0,2},{1,1}}, {{0,0},{1,0},{2,0},{1,1}},
                {{0,0},{1,-1},{1,0},{1,1}}, {{0,1},{1,0},{1,1},{2,1}}
        };

        for (int s = 0; s < shapes.length; s++) {
            int sum = 0;
            boolean valid = true;
            for (int d = 0; d < 4; d++) {
                int ni = i + shapes[s][d][0];
                int nj = j + shapes[s][d][1];
                if (ni < 0 || ni >= N || nj < 0 || nj >= M) {
                    valid = false;
                    break;
                }
                sum += map[ni][nj];
            }
            if (valid) {
                max = Math.max(max, sum);
            }
        }
    }
}
