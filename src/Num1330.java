import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num1330 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String[] inputs = br.readLine().split(" ");
        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);

        if (a > b) {
            System.out.println(">");
        }
        else if (a < b) {
            System.out.println("<");
        }
        else if (a == b) {
            System.out.println("==");
        }
    }
}