import java.io.*;

public class Num25304 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int X =  Integer.parseInt(br.readLine());

        int N =  Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 1; i <= N; i++) {
            String[] receipt = br.readLine().split(" ");
            int a = Integer.parseInt(receipt[0]);
            int b = Integer.parseInt(receipt[1]);

            sum = sum + (a * b);
        }

        if (sum == X) {
            bw.write("Yes" + "\n");
        } else  {
            bw.write("No" + "\n");
        }
        bw.flush();
    }
}
