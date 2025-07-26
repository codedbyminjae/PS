import java.io.*;

public class Num10810 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String[] numbers =  br.readLine().split(" ");
        int N = Integer.parseInt(numbers[0]);
        int M = Integer.parseInt(numbers[1]);

        int[] ball =  new int[N + 1];

        for (int m = 0; m < M; m++) {
            String[] number = br.readLine().split(" ");
            int i = Integer.parseInt(number[0]);
            int j = Integer.parseInt(number[1]);
            int k = Integer.parseInt(number[2]);

            for (int n = i; n <= j; n++) {
                ball[n] = k;
            }
        }

        for (int a = 1; a <= N; a++) {
            bw.write(ball[a] + " ");
        }
        bw.flush();
    }
}
