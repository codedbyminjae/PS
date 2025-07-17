import java.io.*;

public class Num2839 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int N =  Integer.parseInt(br.readLine());

        int count = 0;

        while (N >= 0) {
            if (N % 5 == 0) {
                count = count + N / 5;
                break;
            }
            N = N - 3;
            count++;
        }
        if (N < 0) {
            count = -1;
        }
        bw.write(count + "\n");
        bw.flush();
    }
}
