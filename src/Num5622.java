import java.io.*;

public class Num5622 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String str =  br.readLine();

        int[] dial = {
                3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7,
                8, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10
        };

        int time = 0;

        for (int i = 0; i <str.length(); i++) {
            char ch = str.charAt(i);
            time = time + dial[ch-'A'];
        }

        bw.write(time+"\n");
        bw.flush();

    }
}
