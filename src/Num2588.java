import java.io.*;

public class Num2588 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        int c = (b % 100 % 10);
        int d = a * c;

        int e = (b % 100 - c) / 10;
        int f = a * e;

        int g = (b / 100);
        int h = a * g;


        bw.write(d + "\n" + f + "\n" + h + "\n" + (a*b));
        bw.flush();

    }
}
