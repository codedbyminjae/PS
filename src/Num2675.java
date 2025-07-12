import java.io.*;

public class Num2675 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] input = br.readLine().split(" ");
            int R =  Integer.parseInt(input[0]);
            String s = input[1];

            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < s.length(); j++) {
                char ch = s.charAt(j);
                for (int l = 0; l < R; l++) {
                    sb.append(ch);
                }
            }
            bw.write(sb.toString() + "\n");
        }
        bw.flush();
    }
}