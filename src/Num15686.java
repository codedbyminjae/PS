import java.io.*;

public class Num15686 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        // 항상 입력받은 지도는 정사각형
        // N은 좌표 N * N, M은 폐업 시키지 않는 치킨 집의 수
        // 좌표 거리는 맨해튼 거리로 계산.
        // 치킨집 여러개 폐업 후, 치킨 거리의 최솟값.
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        int[][] map = new int[N][N];

        // 2차원 배열을 만들어 각 좌표를 저장.
        // 후에 각 배열에서 꺼내서 정보 저장.
        int[][] house = new int[N * N][2];
        int[][] chickens = new int[N * N][2];

        // 2차원 배열에 있는 치킨집과, 일반 가정집의 개수
        int houseCount = 0;
        int chickenCount = 0;

        // 0은 빈칸, 1은 집, 2는 치킨집
        for (int r = 0; r < N; r++) {
            String[] row = br.readLine().split(" ");
            for (int c = 0; c < N; c++) {
                map[r][c] = Integer.parseInt(row[c]);
                // 일반 가정집 좌표 저장
                if (map[r][c] == 1) {
                    house[houseCount][0] = r;
                    house[houseCount][1] = c;
                    houseCount++;
                  // 치킨집 좌표 저장
                } else if (map[r][c] == 2) {
                    chickens[chickenCount][0] = r;
                    chickens[chickenCount][1] = c;
                    chickenCount++;
                }
            }
        }

        // dist[h][c] = h번 집 ~ c번 치킨집의 맨해튼 거리
        int[][] dist = new int[houseCount][chickenCount];
        for (int h = 0; h < houseCount; h++) {
            int hr = house[h][0], hc = house[h][1];
            for (int c = 0; c < chickenCount; c++) {
                int cr = chickens[c][0], cc = chickens[c][1];
                dist[h][c] = Math.abs(hr - cr) + Math.abs(hc - cc);
            }
        }

        int C = chickenCount;
        int[] comb = new int[M];
        for (int i = 0; i < M; i++) {
            comb[i] = i;
        }

        int INF = 1000;
        int answer = INF;

        while (true) {
            int sum = 0;
            for (int h = 0; h < houseCount; h++) {
                int best = INF;
                for (int k = 0; k < M; k++) {
                    int cidx = comb[k];
                    int d = dist[h][cidx];
                    if (d < best) best = d;
                }
                sum = sum + best;
                if (sum >= answer) break;
            }
            if (sum < answer) answer = sum;

            int i = M - 1;
            while (i >= 0 && comb[i] == C - M + i) i--;
            if (i < 0) break;       // 끝
            comb[i]++;
            for (int j = i + 1; j < M; j++) comb[j] = comb[j - 1] + 1;
        }
        bw.write(answer + "\n");
        bw.flush();
    }
}
