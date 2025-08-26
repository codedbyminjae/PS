import java.io.*;

public class Num11005 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String[] first =  br.readLine().split(" ");

        long N = Long.parseLong(first[0]);
        int B = Integer.parseInt(first[1]);

        if (N == 0) {
            bw.write("0");
            bw.flush();
            return;
        }

        StringBuilder sb = new StringBuilder();

        while (N > 0) {
            int r = (int)(N % B);
            sb.append(toDigit(r));
            N /= B;
        }
        sb.reverse();
        bw.write(sb.toString());
        bw.flush();
    }

    private static char toDigit(int r) {
        return (r < 10) ? (char)('0' + r) : (char)('A' + (r - 10));
    }
}
