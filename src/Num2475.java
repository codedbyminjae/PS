import java.io.*;

public class Num2475 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String[] s = br.readLine().split(" ");

        int result = 0;
        for (int i = 0; i < s.length; i++) {
            int num = Integer.parseInt(s[i]);
            result = num * num + result;
        }
        bw.write(result%10+"\n");
        bw.flush();
    }
}