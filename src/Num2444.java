import java.io.*;

public class Num2444 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());

        for (int k = 1; k < N; k++) {
            for (int l = 1; l < N-k+1; l++) {
                bw.write(" ");
            }
            for (int m = 0; m < 2*k-1; m++) {
                bw.write("*");
            }
            bw.write("\n");
        }

        for (int i = N ; i > 0; i--) {
            for (int j = 0; j < N-i; j++) {
                bw.write(" ");
            }
            for (int j = 0; j < 2*i-1; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.flush();
    }
}
