import java.io.*;

public class Num27323 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        // A, B 입력 받기
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        // 직사각형 넓이 계산
        int area = A * B;

        // 출력
        bw.write(area + "\n"); // 쉬운 문제 풀이
        bw.flush();
    }
}
