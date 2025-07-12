import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num2420 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String[] sa = br.readLine().split(" ");
        long a = Long.parseLong(sa[0]);
        long b = Long.parseLong(sa[1]);

        System.out.println(Math.abs(a - b));
    }
}