import java.io.*;

public class Num11720 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int N =  Integer.parseInt(br.readLine());
        String s = br.readLine();

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            // -'0' 이 부분이 문자열 숫자를 한글자씩 정수로 변환하는 트릭
            sum = sum + s.charAt(i) - '0';
        }
        bw.write(sum + "\n");
        bw.flush();

    }

}