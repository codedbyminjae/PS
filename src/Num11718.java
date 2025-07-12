import java.io.*;

public class Num11718 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String input;
        StringBuilder k = new StringBuilder();
        while ((input = br.readLine()) != null) {
            k.append(input).append("\n");
        }

        bw.write(k.toString());
        bw.flush();
    }
}