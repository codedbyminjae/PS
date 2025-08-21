import java.io.*;

public class Num2563 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N =  Integer.parseInt(br.readLine());

        boolean[][] paper = new boolean[100][100];

        for (int i = 0; i < N; i++) {
            String[] first = br.readLine().split(" ");
            int A = Integer.parseInt(first[0]);
            int B = Integer.parseInt(first[1]);

            for (int x = A; x < A + 10; x++) {
                for (int y  = B; y < B + 10; y++) {
                    paper[x][y] = true;
                }
            }
        }

        int area = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (paper[i][j]) {
                    area++;
                }
            }
        }

        bw.write(area + "\n");
        bw.flush();
    }
}
