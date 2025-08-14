import java.io.*;

public class Num2579 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int N =  Integer.parseInt(br.readLine());

        int[] score = new int[N];
        for (int i = 0; i < N; i++) {
            score[i] = Integer.parseInt(br.readLine());
        }

        if (N == 1) {
            bw.write(score[0]+"\n");
            bw.flush();
            return;
        }

        if (N == 2) {
            bw.write(score[1] + score[0] +"\n");
            bw.flush();
            return;
        }

        int[] dp = new int[N];
        dp[0] = score[0];
        dp[1] = score[0] + score[1];
        dp[2] = Math.max(score[0] + score[2], score[1] + score[2]);

        for (int i = 3; i < N; i++) {
            dp[i] = Math.max(dp[i - 2], dp[i - 3] + score[i - 1]) + score[i];
        }

        bw.write(dp[N - 1] + "\n");
        bw.flush();

    }
}
