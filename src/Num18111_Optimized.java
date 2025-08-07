import java.io.*;

public class Num18111_Optimized {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        String[] input = br.readLine().split(" ");

        int N =  Integer.parseInt(input[0]);
        int M =  Integer.parseInt(input[1]);
        int B =  Integer.parseInt(input[2]);

        int[][] map = new int[N][M];
        int minHeight = 256;
        int maxHeight = 0;

        for (int i = 0; i < N; i++) {
            String[] row =  br.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(row[j]);
                if (map[i][j] > maxHeight) {
                    maxHeight = map[i][j];
                }
                if (map[i][j] < minHeight) {
                    minHeight = map[i][j];
                }
            }
        }

        int answerTime = Integer.MAX_VALUE;
        int answerHeight = 0;

        for (int h = minHeight; h <= maxHeight; h++) {
            int time = 0;
            int inventory = B;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    int diff = map[i][j] - h;

                    if (diff > 0) {
                        time += diff * 2;
                        inventory += diff;
                    } else if (diff < 0) {
                        time += -diff;
                        inventory -= -diff;
                    }
                }
            }

            if (inventory <0) {
                continue;
            }

            if (time < answerTime || (time == answerTime && h > answerHeight)) {
                answerTime = time;
                answerHeight = h;
            }
        }

        bw.write(answerTime + " " + answerHeight + "\n");
        bw.flush();

    }
}
