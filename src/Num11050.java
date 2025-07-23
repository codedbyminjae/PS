import java.io.*;

public class Num11050 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String[] num = br.readLine().split(" ");
        int a =  Integer.parseInt(num[0]);
        int b = Integer.parseInt(num[1]);

        int number = factorial(a) / (factorial(b) * factorial(a - b));

        bw.write(number + "\n");
        bw.flush();
    }

    public static int factorial(int n){
        int result = 1;
        for (int i = 2; i <= n; i++){
            result = result * i;
        }
        return result;
    }
}
