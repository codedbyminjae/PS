import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num14681 {
    public static void main(String[] args) throws IOException {

        // 이 문제는 스캐너로 입력해야 런타임 에러 해결
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine().split(" ");
        int x = Integer.parseInt(inputs[0]);
        int y = Integer.parseInt(inputs[1]);

        if (x > 0 && y > 0) {
            System.out.println(1);
        } else if (x < 0 && y > 0) {
            System.out.println(2);
        } else if (x < 0 && y < 0) {
            System.out.println(3);
        } else if (x > 0 && y < 0) {
            System.out.println(4);
        }
    }
}