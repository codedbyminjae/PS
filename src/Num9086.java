import java.io.*;

public class Num9086 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            String s = br.readLine();

            char f = s.charAt(0);
            char l = s.charAt(s.length()-1);

            bw.write(f+""+l+"\n");
        }
        bw.flush();
    }
}