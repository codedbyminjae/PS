import java.io.*;
import java.util.Arrays;

public class Num2751 {
    // 정렬 사용
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(numbers);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            sb.append(numbers[i]).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
    }
}
