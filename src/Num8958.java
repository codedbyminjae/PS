import java.io.*;
import java.nio.Buffer;

public class Num8958 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N =  Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            int count = 0;
            int total = 0;

            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                if (ch == 'O') {
                    count++;
                } else {
                    count = 0;
                }
                total = total + count;

            }
            bw.write(total + "\n");
            bw.flush();
        }
    }
}