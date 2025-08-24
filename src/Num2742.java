import java.io.*;

public class Num2742 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());

        for (int i = N; i >= 1; i--) {
            bw.write(i + "\n");
        }
        bw.flush();
    }
}
// 연습 문제