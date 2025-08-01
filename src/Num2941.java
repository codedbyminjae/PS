import java.io.*;

public class Num2941 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String str = br.readLine();

        String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (int i =0; i < croatia.length; i++) {
            while (str.contains(croatia[i])) {
                str = str.replace(croatia[i], "*");
            }
        }

        bw.write(str.length() + "\n");
        bw.flush();

    }
}
