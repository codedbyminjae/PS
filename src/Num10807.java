import java.io.*;

public class Num10807 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());

        String[] s = br.readLine().split(" ");

        int v = Integer.parseInt(br.readLine());

        int count = 0;
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(s[i]);
            if (v == num){
                count++;
            }
        }

        bw.write(count + "\n");
        bw.flush();
    }
}