import java.io.*;

public class Num3003 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String[] chess =  br.readLine().split(" ");

        int[] standard = {1, 1, 2, 2, 2, 8};
        int[] current = new int[6];

        for (int i = 0; i < standard.length; i++) {
            current[i] = Integer.parseInt(chess[i]);
        }

        for (int i = 0; i < standard.length; i++) {
            bw.write(standard[i] - current[i]+ " ");
        }
        bw.flush();

    }
}
