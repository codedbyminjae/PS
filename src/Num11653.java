import java.io.*;

public class Num11653  {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());

        int i = 2;

        while (i * i <= N) { // 루트N까지만 확인 -> 제곱수면 두번 반복될거니까 메모리 낭비 방지
            while (N % i == 0) {
                bw.write(i + "\n");
                N /= i;
            }
            i++;
        }

        if (N > 1) {
            bw.write(N + "\n");
        }

        bw.flush();
    }
}
