import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num2753 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int a = Integer.parseInt(br.readLine());

        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }
}