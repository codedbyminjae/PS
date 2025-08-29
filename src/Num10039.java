import java.io.*;

public class Num10039 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int sum = 0;

        for (int i = 0; i < 5; i++) {
            int score =  Integer.parseInt(br.readLine());
            if (score < 40) {
                score = 40;
            }
            sum += score;
        }

        int average = sum / 5;

        bw.write(average+"\n");
        bw.flush();
    }
}
