import java.io.*;

public class Num10942_Optimized {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N =  Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        String[] numbers = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(numbers[i]);
        }

        boolean[][] dp = new boolean[N][N];

        // odd
        for (int start = 0; start < N; start++) {
            int left = start;
            int right = start;

            while (left >= 0 && right < N && arr[left] == arr[right]) {
                dp[left][right] = true;
                left--;
                right++;
            }
        }

        // even
        for (int start = 0; start < N -1; start++) {
            int left = start;
            int right = start + 1;

            while (left >= 0 && right < N && arr[left] == arr[right]) {
                dp[left][right] = true;
                left--;
                right++;
            }
        }

        int M =  Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            String[] se =  br.readLine().split(" ");
            int start =  Integer.parseInt(se[0]) - 1;
            int end = Integer.parseInt(se[1]) - 1;

            if (dp[start][end]) {
                sb.append("1" + "\n");
            } else {
                sb.append("0" + "\n");
            }
        }
        bw.write(sb.toString());
        bw.flush();

    }
}
