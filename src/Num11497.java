import java.io.*;
import java.util.Arrays;

public class Num11497 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        // 통나무는 원형으로 세워진 것.
        // 인접한 통나무의 높이 차가 최소.

        int t =  Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int N = Integer.parseInt(br.readLine());
            String[] numbers =  br.readLine().split(" ");

            int[] array = new int[N];
            for (int j = 0; j < N; j++) {
                array[j] = Integer.parseInt(numbers[j]);
            }

            Arrays.sort(array);

            int[] jump = new  int[N];
            int start = 0;
            int end = N -1;

            for (int k = 0; k < N; k++) {
                if (k % 2 == 0 ) {
                    jump[start] = array[k];
                    start++;
                } else {
                    jump[end] = array[k];
                    end--;
                }
            }

            /* 정렬 확인
            for (int l = 0; l < N; l++) {
                bw.write(jump[l] + " ");
            }
            bw.write("\n");
             */

            /* 최댓값 출력 부분 틀린 코드
            int mid = N / 2;
            int hardLevel = 0;
            // N이 홀수인 경우 중앙값은 1개 존재
            if (N % 2 == 1) {
                // 자바에서 배열은 0부터 시작하기에 2로 나눈값을 곧바로 사용.
                hardLevel = Math.max(Math.abs(jump[mid] - jump[mid-1]), Math.abs(jump[mid] - jump[mid+1]));
            } else { // 짝수인 경우
                // 중앙값이 2개 존재하기에 ->
                // 1_중앙값과 -1번째 비교, 1_중앙값과 2_중앙값 비교, 2_중앙값과 +1번째 비교.
                int a = Math.abs(jump[mid-1] - jump[mid-2]);
                int b = Math.abs(jump[mid] - jump[mid-1]);
                int c = Math.abs(jump[mid+1] - jump[mid]);
                hardLevel = Math.max(a, Math.max(b, c));
            }
            bw.write(hardLevel + "\n");
             */
            
            // 원형이기에 첫번째값과 끝값 비교를 기본값으로 설정
            int hardLevel = Math.abs(jump[0] - jump[N - 1]);

            // 후에 배열을 모두 순회하며, 높이차의 최댓값 갱신
            for (int m = 1; m < N; m++) {
                int veryHardLevel = Math.abs(jump[m] - jump[m - 1]);
                hardLevel = Math.max(hardLevel, veryHardLevel);
            }
            bw.write(hardLevel+"\n");
        }
        bw.flush();
    }
}
