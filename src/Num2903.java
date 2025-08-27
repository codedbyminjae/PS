import java.io.*;

public class Num2903 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N =  Integer.parseInt(br.readLine());

        int dots = (int)Math.pow(2, N) + 1;
        int result = dots * dots;

        bw.write(result + "\n");
        bw.flush();
    }
}
