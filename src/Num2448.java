import java.io.*;

public class Num2448 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static char[][] star; // 별 찍을 2차원 공간

    public static void main(String[] args) throws IOException {
        // N값 입력 N은 3 * 2의 제곱수
        int N =  Integer.parseInt(br.readLine());

        // 도화지 생성
        star =  new char[N][2 * N - 1]; // 마지막 줄은 가득차야 하기에 열 갯수 조정
        
        // 도화지 초기화, 후에 필요한 위치에만 별 출력
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2 * N - 1; j++) {
                star[i][j] = ' ';
            }
        }

        // 재귀 호출 시작, 꼭대기 위치, 전체높이
        drawStar(0, N - 1, N);

        // 출력
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2 * N - 1; j++) {
                bw.write(star[i][j]);
            }
            bw.write("\n");
        }
        bw.flush();
    }

    // 매개변수 = 현재 삼각형의 꼭대기 좌표 r,c / 삼각형의 높이 n
    static void drawStar(int r, int c, int n) {
        // 가장 작은 삼각형은 직접 그리기
        if (n == 3) {
            // 맨 꼭대기
            star[r][c] = '*';

            // 두 번째 줄
            star[r + 1][c - 1] = '*';
            star[r + 1][c + 1] = '*';

            // 세 번째 줄
            for (int i = -2; i <= 2; i++) {
                star[r + 2][c + i] = '*';
            }
            return;
        }

        // 삼각형을 3등분해서 재귀 호출
        int half = n / 2;
        drawStar(r, c, half); // 위쪽 삼각형
        drawStar(r + half, c - half, half); // 좌 하단
        drawStar(r + half, c + half, half); // 우 하단
    }
}
