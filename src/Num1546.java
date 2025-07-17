import java.io.*;

public class Num1546 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int T = Integer.parseInt(br.readLine());
        String[] num =  br.readLine().split(" ");

        double[] score = new double[T];
        double M = 0;

        for (int i = 0; i < T; i++) {
            score[i] = Integer.parseInt(num[i]);
            if (score[i] > M) {
                M = score[i];
            }
        }

        double sum = 0;

        for (int i = 0; i < T; i++) {
            double newScore = (score[i]/M) * 100;
            sum = sum + newScore;
        }
        bw.write(sum/T+"\n");
        bw.flush();
    }
}
