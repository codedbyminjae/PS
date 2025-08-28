import java.io.*;
import java.util.Arrays;

public class Num10817 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);

        int[] arr = {a, b, c};
        Arrays.sort(arr);

        bw.write(arr[1] + "\n");
        bw.flush();
    }
}
