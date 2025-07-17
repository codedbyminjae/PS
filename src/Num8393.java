import java.io.*;

public class Num8393 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n =  Integer.parseInt(br.readLine());

        int sum = 0;
        for (int i = 1; i <= n; i++) {

            sum = i + sum;
        }
        bw.write(sum+"\n");
        bw.flush();

    }
}
