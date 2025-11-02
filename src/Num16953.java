import java.io.*;

public class Num16953 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String[] input = br.readLine().split(" ");

        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);

        int count = 1;

        while (B != A) {
            if (B < A) { // 불가능 부분
                count = -1;
                break;
            }

            if (B % 10 == 1) { // 1을 가장 오른쪽에 추가하는 경우
                B /= 10;
                count++;
            } else if (B % 2 == 0) { // 2를 곱하는 경우
                B /= 2;
                count++;
            } else { // 연산 불가 경우
                count = -1;
                break;
            }
        }

        bw.write(count + "\n");
        bw.flush();
    }
}
