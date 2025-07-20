import java.io.*;
import java.math.BigInteger;

public class Num1271 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String[] str =  br.readLine().split(" ");
        BigInteger n = new BigInteger(str[0]);
        BigInteger m = new BigInteger(str[1]);

        bw.write(n.divide(m) + "\n");
        bw.write(n.remainder(m) + "\n");
        bw.flush();

    }
}
