import java.io.*;

public class Num1316 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());

        int count = 0;

        for (int i = 0; i < N; i++) {
            String word =  br.readLine();

            if (word.length() <= 2) {
                count++;
                continue;
            }

            boolean isGroup = true;

            for (int j = 0; j < word.length() - 1; j++) {
                char now = word.charAt(j);
                char next =  word.charAt(j + 1);

                if (now != next) {
                    for (int k = j+ 2; k < word.length(); k++) {
                        if (word.charAt(k) == now) {
                            isGroup = false;
                            break;
                        }
                    }
                }
                if (!isGroup) {
                    break;
                }
            }
            if (isGroup) {
                count++;
            }
        }
        bw.write(count + "\n");
        bw.flush();
    }
}
