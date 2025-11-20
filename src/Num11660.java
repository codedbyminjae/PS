import java.io.*;

public class Num11660 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        // for문으로 순회하면 무조건 시간초과
        // s[x][y] = 1,1 ~ x,y
        // s[x2][y2] - s[x1-1][y2](위) - s[x2][y1-1](왼)

        // 1. 입력값 처리
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]); // 배열 크기
        int M = Integer.parseInt(input[1]); // 정답 개수

        // 원본 map
        int[][] map = new int[N+1][N+1];

        for (int i = 1; i <= N; i++) {
            String[] row = br.readLine().split(" ");
            for (int j = 1; j <= N; j++) {
                map[i][j] = Integer.parseInt(row[j - 1]);
            }
        }

        // 2. 알고리즘
        int sum = 0;
        int[][] S = new int[N+1][N+1]; // frefix 배열 생성
        // 누적 합 배열 채우기
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                S[i][j] = S[i-1][j] // 위쪽 누적합
                        + S[i][j-1] // 왼쪽 누적합
                        - S[i-1][j-1] // 위 + 왼 겹친 부분 제거
                        + map[i][j]; // 현재 위치 값 더해주기
            }
        }

        for (int k = 0; k < M; k++) {
            String[] answer = br.readLine().split(" ");
            int x1 =  Integer.parseInt(answer[0]);
            int y1 =  Integer.parseInt(answer[1]);
            int x2 =  Integer.parseInt(answer[2]);
            int y2 =  Integer.parseInt(answer[3]);

            sum = S[x2][y2] - S[x1-1][y2] - S[x2][y1-1] + S[x1-1][y1-1];
            bw.write(sum + "\n");
        }
        bw.flush();



    }
}
