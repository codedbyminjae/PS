import java.io.*;

public class Num1018 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);

        char[][] map = new char[N][M];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = line.charAt(j);
            }
        }

        int min = 64;

        for (int i = 0; i <= N-8; i++) {
            for (int j = 0; j <= M-8; j++) {

                int countW = 0;
                int countB = 0;

                for (int x = 0; x < 8; x++) {
                    for (int y = 0; y < 8; y++) {

                        char current = map[i+x][j+y];

                        if ((x + y) % 2 == 0) {
                            if (current != 'W') countW++;
                            if (current != 'B') countB++;
                        }
                        else {
                            if (current != 'W') countB++;
                            if (current != 'B') countW++;
                        }

                    }
                }

                int currentMin = (countW < countB) ? countW : countB;
                if (currentMin < min) min = currentMin;
            }
        }
        bw.write(min + "\n");
        bw.flush();

    }
}
