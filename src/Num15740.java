import java.io.*;
import java.math.BigInteger;

public class Num15740 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        String[] input = br.readLine().split(" ");

        BigInteger a = new BigInteger(input[0]);
        BigInteger b = new BigInteger(input[1]);

        BigInteger sum = a.add(b);

        bw.write(sum.toString());
        bw.flush();

    }
}
