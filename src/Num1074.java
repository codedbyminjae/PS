import java.io.*;

public class Num1074 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int r = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);

        int[][] A = {
                {0, 1},
                {2, 3}
        };

        if (N == 1) {
            bw.write(A[r][c] + "\n");
            bw.flush();
            return;
        }

        if (N == 2) {
            // 한 변의 길이 +-로 사분면 순회
            int size = 2;
            // 순회를 위한 배열 크기
            int block = size*size; // 한 사분면의 칸 수 = 4

            int[][] B = new int[4][4]; // 결과를 담을 배열

            // A의 각 값을 네 사분면으로 복제 후 더하기
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    int v = A[i][j]; // 기존 값

                    B[i][j] = v;
                    B[i][j + size] = v + block;
                    B[i + size][j] = v + 2 * block;
                    B[i + size][j + size] = v + 3 * block;
                }
            }

            bw.write(B[r][c] + "\n");
            bw.flush();
            return;
        }
        // N >= 3 -> N=2 때의 타일 복제 로직을 반복해서 확장
        if (N >= 3) {
            int size = 2;        // 현재 A의 한 변 길이 2부터 시작
            int[][] arr = A;     // 초기 선정 배열 참조

            // 목표 크기가 될 때까지 확장
            int target = 1 << N; // 2^N
            while (size < target) {
                int block = size * size;
                int newSize = size * 2;
                int[][] B = new int[newSize][newSize];

                // A의 (i,j)를 네 사분면을 기준으로 연산
                for (int i = 0; i < size; i++) {
                    for (int j = 0; j < size; j++) {
                        int v = arr[i][j];

                        // 제 2사분면
                        B[i][j] = v;
                        // 제 1사분면
                        B[i][j + size] = v + block;
                        // 제 3사분면
                        B[i + size][j] = v + 2 * block;
                        // 제 4사분면
                        B[i + size][j + size] = v + 3 * block;
                    }
                }

                arr = B;      // 다음 라운드의 기반 배열
                size = newSize;
            }

            bw.write(arr[r][c] + "\n");
            bw.flush();
        }



    }
}
