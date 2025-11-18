import java.io.*;

public class Num2501v2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        String[] str =  br.readLine().split(" ");
        int p = Integer.parseInt(str[0]);
        int q = Integer.parseInt(str[1]);

        int[] arr = new int[p + 1];
        int count = 0;

        for (int i = 1; i <= p; i++) {
            if (p % i == 0) {
                arr[count] = i;
                count++;
            }
        }

        if (q <= count) {
            bw.write(arr[q - 1] + "\n");
        } else {
            bw.write("0\n");
        }
        bw.flush();
    }
}
