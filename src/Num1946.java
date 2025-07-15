import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Num1946 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine());
            List<Integer[]> list = new ArrayList<>();

            // 지원자 정보 입력 받기
            for (int i = 0; i < N; i++) {
                String[] input = br.readLine().split(" ");
                int paper = Integer.parseInt(input[0]);     // 서류 등수
                int interview = Integer.parseInt(input[1]); // 면접 등수
                list.add(new Integer[]{paper, interview});
            }

            // 서류 등수 오름차순 정렬
            // 추후 람다식 사용
            Collections.sort(list, new Comparator<Integer[]>() {
                @Override
                public int compare(Integer[] a, Integer[] b) {
                    return a[0] - b[0];
                }
            });
            // 오름 차순 후에는 list[1]에 있는 면접 등수로만 비교 시작

            // 서류 1등이니까 첫번째 사람은 무조건 합격
            int count = 1;
            int minInterview = list.get(0)[1];

            for (int i = 1; i < N; i++) {
                // 면접 등수의 값이 낮다 -> 등수가 높다. 잘봤다.
                if (list.get(i)[1] < minInterview) {
                    // 합격자 수 증가
                    count = count + 1;
                    // 최소 기준치 변경
                    minInterview = list.get(i)[1];
                }
            }
            bw.write(count + "\n");
        }
        bw.flush();
    }
}