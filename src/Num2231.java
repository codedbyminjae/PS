import java.io.*;

public class Num2231 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int N =  Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 1; i <= N; i++) {
            int sum = i;
            int temp = i;

            while (temp > 0 ) {
                sum = sum + temp % 10;
                temp = temp / 10;
            }

            if (sum == N) {
                result = i;
                break;
            }
        }
        bw.write(result + "\n");
        bw.flush();

    }
}
