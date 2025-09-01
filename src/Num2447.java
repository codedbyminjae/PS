import java.io.*;

public class Num2447 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        // 전체 도화지 N*N
        // 각 좌표를 3x3으로 다 나누었을 때, (1,1)은 공백
        // (1,1), (4,4), (7,7) ... (100,100)
        // 전체를 기준으로 1행 1열 공백
        int N = Integer.parseInt(br.readLine());

        // 전체 도화지 순회
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                // 현재 좌표 공백 판별
                boolean isBlank = false;

                int x = i;
                int y = j;

                while (x > 0) {
                    // 전체 좌표 기준, 가운데 공백 처리 코드
                    if (x % 3 == 1 && y % 3 == 1) {
                        isBlank = true;
                    }
                    x /= 3;
                    y /= 3;
                }
                bw.write(isBlank ? ' ' : '*');
            }
            bw.write("\n");
        }
        bw.flush();
    }
}
