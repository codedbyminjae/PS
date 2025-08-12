import java.io.*;
import java.util.Arrays;

public class Num11399 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");

        int[] time = new int[N];

        for (int i = 0; i < N; i++) {
            time[i] = Integer.parseInt(input[i]);
        }

        Arrays.sort(time);

        int count = 0;
        int sum = 0;

        for (int i = 0; i < N; i++) {
            count += time[i];
            sum += count;
        }

        bw.write(sum + "\n");
        bw.flush();
    }
}
