import java.io.*;

public class Num1110 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int org = Integer.parseInt(br.readLine());
        int num = org;
        int count = 0;

        for (count = 1;; count++) {
            int left = num / 10;
            int right = num % 10;
            int sum = left + right;
            num = right * 10 + sum % 10;

            if (num == org) {
                break;
            }
        }
        bw.write(count+"\n");
        bw.flush();
    }
}
