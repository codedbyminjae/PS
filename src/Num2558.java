import java.io.*;
import java.nio.Buffer;

public class Num2558 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int A =  Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        bw.write(A+B + "\n");
        bw.flush();

    }
}
