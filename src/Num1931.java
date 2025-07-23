import java.io.*;
import java.util.Arrays;

public class Num1931 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        // 입력 정보 저장을 위한 배열 [n][2] 선언
        int [][] meeting = new int[n][2];
        
        // 입력
        for (int i = 0 ; i < n ; i++) {
            String[] numbers =  br.readLine().split(" ");
            int a = Integer.parseInt(numbers[0]);
            int b = Integer.parseInt(numbers[1]);

            meeting[i][0] = a;
            meeting[i][1] = b;
        }

        // 종료 시간 기준 정렬
        // 종료 시간이 작다는 것은, 시작 시간은 더 작다는 것을 의미.
        Arrays.sort(meeting, (a, b) -> {
            if (a[1] == b[1]) {
                return a[0] - b[0];
            }
            return a[1] - b[1];
        });

        int result = maxMeeting(meeting);

        bw.write(result + "\n");
        bw.flush();
    }

    static int maxMeeting(int[][] meeting){
        int count = 0;
        int endTime = 0;

        // 현재 회의의 시작 시간이, 이전 회의 종료 시간 보다 같거나 늦으면, count 증가
        for (int i = 0; i < meeting.length; i++){
            if (meeting[i][0] >= endTime) {
                endTime = meeting[i][1];
                count++;
            }
        }
        return count;
    }
}
