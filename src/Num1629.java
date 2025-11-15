import java.io.*;

public class Num1629 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {

        // 해당 문제는 바이브 코딩으로
        String[] input = br.readLine().split(" ");
        long A = Long.parseLong(input[0]);
        long B = Long.parseLong(input[1]);
        long C = Long.parseLong(input[2]);

        // 빠른 거듭제곱용 변수들
        long base = A % C;   // 밑 (항상 C로 나눈 나머지 상태로 유지)
        long exp = B;        // 지수
        long result = 1;     // 결과값 (초기값 1)

        // (A^B) % C 를 O(log B)로 계산
        while (exp > 0) {
            // 현재 비트(지수의 마지막 비트)가 1이면 결과에 base를 한 번 곱해줌
            if (exp % 2 == 1) {
                result = (result * base) % C;
            }
            // base를 제곱해서 다음 비트 준비
            base = (base * base) % C;

            // 지수를 한 비트 오른쪽으로 밀기 (exp / 2와 같음)
            exp /= 2;
        }

        // 최종 결과 출력
        bw.write(result + "\n");
        bw.flush();
    }
}
