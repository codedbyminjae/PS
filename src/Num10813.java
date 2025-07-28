import java.io.*;

public class Num10813 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String[] ball = br.readLine().split(" ");

        int N =  Integer.parseInt(ball[0]);
        int M =  Integer.parseInt(ball[1]);

        int[] basket = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            basket[i] = i;
        }

        for (int i = 0; i < M; i++) {
            String[] change =  br.readLine().split(" ");
            int a = Integer.parseInt(change[0]);
            int b = Integer.parseInt(change[1]);

            int temp = basket[a];
            basket[a] = basket[b];
            basket[b] = temp;
            }
        for (int i = 1; i <= N; i++) {
            bw.write(basket[i] + " ");
        }
        bw.flush();
    }
}


