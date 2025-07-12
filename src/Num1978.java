import java.io.*;
import java.nio.Buffer;

public class Num1978 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        String[] nums = br.readLine().split(" ");

        int count = 0;
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(nums[i]);
            if (isPrime(num)) {
                count++;
            }
        }
        bw.write(count + "\n");
        bw.flush();
    }

    // 소수 공식
    public static boolean isPrime(int num) {
        if (num < 2)
            return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
