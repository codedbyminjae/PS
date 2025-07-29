import java.io.*;
import java.util.StringTokenizer;

public class Num2908 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String[] numbers = br.readLine().split(" ");

        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);

        StringBuilder sb1 = new StringBuilder(String.valueOf(a));
        StringBuilder sb2 = new StringBuilder(String.valueOf(b));

        sb1.reverse();
        sb2.reverse();

        int reverseA = Integer.parseInt(sb1.toString());
        int reverseB = Integer.parseInt(sb2.toString());

        bw.write(Math.max(reverseA, reverseB) + "\n");
        bw.flush();
    }
}
