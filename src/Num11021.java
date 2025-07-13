import java.io.*;

public class Num11021 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N =  Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String[] num =  br.readLine().split(" ");
            int a = Integer.parseInt(num[0]);
            int b = Integer.parseInt(num[1]);
            bw.write("Case #"+(i+1)+":"+" "+(a+b)+"\n");
        }
        bw.flush();

    }
}
