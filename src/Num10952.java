import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num10952 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        while(true) {
            String[] k = br.readLine().split(" ");

            int a = Integer.parseInt(k[0]);
            int b = Integer.parseInt(k[1]);

            if (a == 0 && b == 0) {
                return;
            }
            System.out.println(a + b);
        }
    }
}