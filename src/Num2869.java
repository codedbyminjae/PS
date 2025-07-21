import java.io.*;

public class Num2869 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String[] str =  reader.readLine().split(" ");
        int A = Integer.parseInt(str[0]);
        int B = Integer.parseInt(str[1]);
        int V = Integer.parseInt(str[2]);

        int day = (int)Math.ceil((V-A) / (double)(A - B)) + 1;

        bw.write(day + "\n");
        bw.flush();
    }
}
