import java.io.*;

public class Num2445 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int N =  Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                bw.write("*");
            }
            for (int j = 1; j <= 2*(N-i); j++) {
                bw.write(" ");
            }
            for (int j = 1; j <= i; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }
        // 아래쪽
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N-i; j++) {
                bw.write("*");
            }
            for (int j = 1; j <= 2*i; j++) {
                bw.write(" ");
            }
            for (int j = 1; j <= N-i; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.flush();
    }
}
