import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num10950 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++){
            String[] z = br.readLine().split(" ");
            int a = Integer.parseInt(z[0]);
            int b = Integer.parseInt(z[1]);

            System.out.println(a + b);
        }
    }
}