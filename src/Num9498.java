import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num9498 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int x = Integer.parseInt(br.readLine());

        if (x >= 90) {
            System.out.println("A");
        } else if (x < 90 && x >= 80) {
            System.out.println("B");
        } else if (x < 80 && x >= 70) {
            System.out.println("C");
        } else if (x < 70 && x >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}