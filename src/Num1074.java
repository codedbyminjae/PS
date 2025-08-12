import java.io.*;

public class Num1074 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int r = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);

        int result = 0;

        while (N > 0) {

            // 한 사분면의 길이
            int quarter = (int) Math.pow(2, N - 1);
            // 정사각형 -> 한 사분면의 크기
            int size = quarter * quarter;


            if (r < quarter && c >= quarter) { // 1 사분면
                // 2사분면 값을 모두 지나야 하기에 1 * size
                result = result + 1 * size;
                c = c - quarter;
            } else if (r < quarter && c < quarter) { // 2 사분면

            } else if (r >= quarter && c < quarter) { // 3 사분면
                // 1, 2 사분면을 모두 지나간 값 8부터 시작
                result = result + 2 * size;
                r = r - quarter;
            } else if (r >= quarter && c >= quarter) { // 4 사분면
                // 1, 2, 3 사분면을 모두 지난 12부터 값 시작
                result = result + 3 * size;
                r = r - quarter;
                c = c - quarter;
            }
            N--;
        }
        bw.write(result + "\n");
        bw.flush();
    }
}
