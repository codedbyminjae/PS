import java.io.*;

public class Num10818 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        String[] s =  br.readLine().split(" ");

        int min = Integer.parseInt(s[0]);
        int max = min;

        for (int i = 1; i < N; i++) {
            int num =  Integer.parseInt(s[i]);
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        bw.write(min+" " +max+"\n");
        bw.flush();
    }
}