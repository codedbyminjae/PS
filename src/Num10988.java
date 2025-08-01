import java.io.*;

public class Num10988 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        StringBuilder original = new StringBuilder(br.readLine());

        StringBuilder reverse = new StringBuilder(original).reverse();

        if (original.toString().equals(reverse.toString())) {
            bw.write("1\n");
        } else {
            bw.write("0\n");
        }
        bw.flush();

    }
}
