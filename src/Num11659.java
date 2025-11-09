import java.io.*;

// 해당 문제는 인덱스를 1부터 시작하는 것으로 풀었으면 조금 더 쉽게 접근 할 수 있는 문제
public class Num11659 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        String[] input = br.readLine().split(" ");

        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        String[] nums = br.readLine().split(" ");
        int[] array = new int[N];
        int[] prefix = new int[N];

        for(int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(nums[i]);
            if (i == 0) {
                prefix[i] = array[i];
            } else {
                prefix[i] = prefix[i - 1] + array[i];
            }
        }

        for (int j = 0; j < M; j++) {
            String[] condition = br.readLine().split(" ");
            int a = Integer.parseInt(condition[0]);
            int b = Integer.parseInt(condition[1]);

            int sum = prefix[b - 1] - (a > 1 ? prefix[a -2 ] : 0); // 3항 조건 연산자로 계산
            bw.write(sum + "\n");
        }
        bw.flush();
    }
}
