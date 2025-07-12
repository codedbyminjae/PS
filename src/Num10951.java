import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;

        while ((input = br.readLine()) != null && !input.isEmpty()) {
            String[] a = input.trim().split(" ");
            // 버퍼를 사용했기에 조건문 다시 생각
            if (a.length < 2) continue;

            int x = Integer.parseInt(a[0]);
            int y = Integer.parseInt(a[1]);

            System.out.println(x + y);
        }
    }
}