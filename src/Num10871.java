import java.io.*;

public class Num10871 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String[] a = br.readLine().split(" ");
        int N = Integer.parseInt(a[0]);
        int X = Integer.parseInt(a[1]);

        String[] b = br.readLine().split(" ");
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(b[i]);
            if (num < X) {
                s.append(num + " ");
            }
        }
        bw.write(s.toString());
        bw.flush();
    }
}