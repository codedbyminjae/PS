import java.io.*;

public class Num2292 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());

        int room = 1;
        int range = 1;
        if (N == 1) {
            bw.write(room + "\n");
        } else {
            while (N > range) {
                range = range + room * 6;
                room++;
            }
            bw.write(room + "\n");
        }
        bw.flush();
    }
}
