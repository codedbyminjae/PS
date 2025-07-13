import java.io.*;
import java.nio.Buffer;

public class Num10430 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        String[] nums =  br.readLine().split(" ");
        int a =  Integer.parseInt(nums[0]);
        int b =  Integer.parseInt(nums[1]);
        int c =  Integer.parseInt(nums[2]);

        int rsa = (a+b)%c;
        int rsb = ((a%c)+(b%c))%c;
        int rsc = (a*b)%c;
        int rsd = ((a%c)*(b%c))%c;
        bw.write(rsa + "\n");
        bw.write(rsb + "\n");
        bw.write(rsc + "\n");
        bw.write(rsd + "\n");
        bw.flush();
    }
}
