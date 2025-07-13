import java.io.*;

public class Num2440 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int N =  Integer.parseInt(br.readLine());

        for (int i = N; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.flush();
    }
}
