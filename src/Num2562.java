import java.io.*;

public class Num2562 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int max = Integer.parseInt(br.readLine());
        int num = 1;
        // 처음에 num을 0으로 설정하였음.
        // 이경우 첫번째 값이 최댓값인 경우 조건 실행 불가능
        for (int i = 2; i <= 9; i++) {
            int k = Integer.parseInt(br.readLine());

            if (k > max) {
                max = k;
                num = i;
            }
        }
        bw.write(max + "\n" + num + "\n");
        bw.flush();

    }
}