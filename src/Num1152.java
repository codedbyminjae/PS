import java.io.*;

public class Num1152 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        // .trim은 문자열 맨 앞뒤 제거
        // split 내부에 "\\s+"는 공백 2개 이상을 한개로 변환
        String sentence = br.readLine().trim();

        // 공백만 있는 경우는 빈 배열로 처리되기 때문에 길이가 0이면 0을 출력
        if (sentence.isEmpty()) {
            bw.write("0\n");
        } else {
            String[] words = sentence.split("\\s+");
            int count = words.length;
            bw.write(count + "\n");
        }

        bw.flush();
    }
}