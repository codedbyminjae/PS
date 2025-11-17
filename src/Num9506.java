import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Num9506 {
    // 완전수는 자기 자신을 제외한 모든 양의 약수들의 합이 자기 자신과 같은 자연수 (6, 28, 496 등)
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        // 1. 숫자를 계속 받기 위한 while 문 준비
        while (true) {
            int n = Integer.parseInt(br.readLine());
            // 2. 종료 조건
            if (n == -1) break;

            // 3. 약수 저장 리스트 준비
            List<Integer> list = new ArrayList<>();
            int sum = 0;

            // 4. 약수 찾기, 찾을때 마다 list에 삽입
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    list.add(i);
                    sum += i;
                }
            }

            // 5. 출력 조건 제시
            if (sum == n) { // 5-1. 완전수 처리
                // n = d1 + d2 + d3 형식 출력
                bw.write(n + " = ");
                for (int i = 0; i < list.size(); i++) {
                    bw.write(String.valueOf(list.get(i)));
                    if (i < list.size() - 1) {
                        bw.write(" + ");
                    }
                }
                bw.write("\n");
            } else { // 5-2. 완전수 아닌 경우
                bw.write(n + " is NOT perfect.\n");
            }
        }

        bw.flush();
    }
}
