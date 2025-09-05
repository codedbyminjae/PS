import java.io.*;

public class Num1085 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String[] input =  br.readLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        int w = Integer.parseInt(input[2]);
        int h = Integer.parseInt(input[3]);

        int left = x;
        int bottom = y;
        int right = w - x;
        int top = h - y;

        int min = Math.min(Math.min(left, bottom), Math.min(right, top));

        bw.write(min + "\n");
        bw.flush();
    }
}
