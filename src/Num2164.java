import java.io.*;
import java.util.*;

public class Num2164 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int N =  Integer.parseInt(br.readLine());

        Queue<Integer> q = new ArrayDeque<>();

        for (int i = 1; i <= N; i++) {
            q.offer(i);
        }

        while (q.size() > 1) {
            q.poll();
            q.offer(q.poll());
        }

        bw.write(q.poll() + "\n");
        bw.flush();
    }
}
