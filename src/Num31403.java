import java.io.*;

public class Num31403 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());

        int a = N + M - K;
        String s = "";
        s = s + N;
        s = s + M;
        bw.write(a + "\n");
        bw.write(Integer.parseInt(s)-K + "\n");
        bw.flush();
    }
}