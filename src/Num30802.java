import java.io.*;

public class Num30802 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N =  Integer.parseInt(br.readLine());
        String[] S = br.readLine().split(" ");

        String[] tp =  br.readLine().split(" ");
        int T = Integer.parseInt(tp[0]);
        int P = Integer.parseInt(tp[1]);

        int[] shirts = new int[6];

        for (int i = 0; i < 6; i++) {
            shirts[i] = Integer.parseInt(S[i]);
        }

        // 정수형 올림 나눗셈 공식
        int tshirtsBundle = 0;
        for (int i = 0; i < 6; i++) {
            tshirtsBundle = tshirtsBundle + (shirts[i] + T - 1)/ T;
        }

        int penBundle = N / P;
        int penSingle = N % P;

        bw.write(tshirtsBundle + "\n");
        bw.write(penBundle + " " + penSingle +"\n");
        bw.flush();
    }
}
