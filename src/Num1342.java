import java.io.*;

public class Num1342 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        // 문자열 입력
        String input = br.readLine();

        // 입력받은 문자열을 문자 배열로 변환
        char[] string = input.toCharArray();
        int[] charCount = new int[26]; // 알파벳 개수 저장용

        // 알파벳 빈도 계산
        for (char c : string) {
            charCount[c - 'a']++;
        }

        int totalLength = string.length;
        int[] count = {0}; // 행운 문자열 개수 저장 (final 효과 위해 배열 사용)

        // dfs 함수 호출
        dfs(0, '\0', charCount, totalLength, count);

        // 결과 출력
        bw.write(count[0] + "\n");
        bw.flush();
    }

    // DFS
    public static void dfs(int depth, char prev, int[] charCount, int totalLength, int[] count) {
        if (depth == totalLength) {
            count[0]++;
            return;
        }

        for (int i = 0; i < 26; i++) {
            // 해당 문자가 없으면 pass
            if (charCount[i] == 0) {
                continue;
            }
            // 이전 문자와 아스키 코드 값이 같으면 pass
            if (prev == (char)(i + 'a')) {
                continue; // 연속 문자 방지
            }

            charCount[i]--;
            dfs(depth + 1, (char)(i + 'a'), charCount, totalLength, count);
            charCount[i]++; // 백트래킹
        }
    }
}
