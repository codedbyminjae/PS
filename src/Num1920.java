import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Num1920 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N =  Integer.parseInt(br.readLine());
        String[] number =  br.readLine().split(" ");

        Set<Integer> numbers = new HashSet<Integer>();

        for (int i = 0; i < N; i++) {
            numbers.add(Integer.parseInt(number[i]));
        }

        int M = Integer.parseInt(br.readLine());

        String[] compares = br.readLine().split(" ");
        for (int i = 0; i < M; i++) {
            int compare =  Integer.parseInt(compares[i]);
            if (numbers.contains(compare)) {
                bw.write("1" + "\n");
            } else
                bw.write("0" + "\n");
        }
        bw.flush();
    }
}
