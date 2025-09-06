import java.io.*;

public class Num1193 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        // 찾고자 하는 분수의 순서 번호
        int X = Integer.parseInt(br.readLine());

        // 대각선 번호, 누적 분수 개수
        int line = 0;
        int sum = 0;

        while (sum < X) {
            line++; // 대각선 번호 증가
            sum = sum + line; // 누적 합 증가
        }
        
        int indexInLine = X - (sum - line); // line 번째 줄에서 몇 번째 항인지

        int numerator, denominator;
        if (line % 2 == 0) {
            // 짝수 줄 ↘
            numerator = indexInLine;
            denominator = line - indexInLine + 1;
        } else {
            // 홀수 줄 ↗
            numerator = line - indexInLine + 1;
            denominator = indexInLine;
        }

        bw.write(numerator + "/" + denominator);
        bw.flush();
    }
}
