import java.io.*;

public class Num2577 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int result = A * B * C;

        String rsrt = Integer.toString(result);

        int[] count = new int[10];

        // name.charAt(i) - '0'
        for (int i = 0; i < rsrt.length(); i++) {
            count[rsrt.charAt(i)-'0']++;
        }

        for (int i = 0; i < 10; i++) {
            bw.write(count[i] + "\n");
        }
        bw.flush();
    }
}