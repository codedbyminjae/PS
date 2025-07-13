import java.io.*;

public class Num2442 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());

        for (int i = 0 ; i < N ; i++) {
            for (int j = 1; j < N-i; j++) {
                bw.write(" ");
            }
            for (int j = 0; j < 2*i+1; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.flush();
    }
}
