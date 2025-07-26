import java.io.*;

public class Num25314 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N =  Integer.parseInt(br.readLine());

        int count = N / 4;

        for (int i = 0; i < count; i++) {
            bw.write("long ");
        }
        bw.write("int" + "\n");
        bw.flush();
    }
}
