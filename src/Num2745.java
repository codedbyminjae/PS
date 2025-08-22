import java.io.*;

public class Num2745 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        String[] input = br.readLine().split(" ");
        String N = input[0];
        int B =  Integer.parseInt(input[1]);

        int result = 0;

        for (int i = 0; i < N.length(); i++) {
            char c = N.charAt(i);
            int value;

            if (c >= '0' && c <= '9') {
                value = c - '0';
            } else { // A는 10부터 시작
                value = c - 'A' + 10;
            }

            result = result * B + value;
        }

        bw.write(String.valueOf(result));
        bw.flush();

    }
}
