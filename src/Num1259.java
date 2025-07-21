import java.io.*;

public class Num1259 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {



        while (true) {
            String str =  br.readLine();

            if (str.equals("0")) {
                break;
            }

            String reversed = new StringBuilder(str).reverse().toString();

            if (str.equals(reversed)) {
                bw.write("yes" + "\n");
            } else {
                bw.write("no" + "\n");
            }

        }
        bw.flush();
    }
}
