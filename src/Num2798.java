import java.io.*;

public class Num2798 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        // 입력받는 줄 공백 기준으로 입력
        String[] numbers =  br.readLine().split(" ");

        // 0번째는 카드의 총 개수, 1번째는 최대로 구하고자 하는 수(정식 블랙잭은 21)
        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);

        // 입력받는 숫자
        String[] cards = br.readLine().split(" ");
        // 새로운 배열을 만들어, 입력받은 문자형태의 숫자들을 정수형으로 변환
        int[] blackjack = new int[a];
        for (int i = 0; i < a; i++) {
            blackjack[i] = Integer.parseInt(cards[i]);
        }

        int max = 0;

        // 앞선 배열을 순회하면서 최댓값 찾기
        // 3중 for문을 순회하는 조건
        for (int i = 0; i < a - 2; i++) {
            for (int j = i + 1; j < a - 1; j++) {
                for (int k = j + 1; k < a; k++) {
                    int sum = blackjack[i] + blackjack[j] + blackjack[k];
                    if (sum <= b && sum > max) {
                        max = sum;
                    }
                }
            }
        }
        // 출력
        bw.write(max+"\n");
        bw.flush();

    }
}
