import java.io.*;

public class Num4344 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int C = Integer.parseInt(br.readLine());

        for (int i = 0; i < C; i++) {
            String[] input = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]);
            int[] scores = new int[N];
            int sum = 0;

            for (int j = 0; j < N; j++) {
                scores[j] = Integer.parseInt(input[j + 1]);
                sum += scores[j];
            }

            double average = (double) sum / N;

            int count = 0;
            for (int j = 0; j < N; j++) {
                if (scores[j] > average) {
                    count++;
                }
            }

            double rate = (double) count / N * 100;
            bw.write(String.format("%.3f%%\n", rate));
        }

        bw.flush();
    }
}
