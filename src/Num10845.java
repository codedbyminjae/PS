import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Num10845 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int T =  Integer.parseInt(br.readLine());

        Queue<Integer> q = new LinkedList<>();
        int last = -1;

        for (int i = 0; i < T; i++) {
            String[] str =  br.readLine().split(" ");

            switch (str[0]) {
                case "push":
                    last = Integer.parseInt(str[1]);
                    q.offer(last);
                    break;

                case "pop":
                    if (q.isEmpty()) {
                        bw.write("-1" + "\n");
                    } else {
                        bw.write(q.poll() + "\n");
                    }
                    break;

                case "size":
                    bw.write(q.size() + "\n");
                    break;

                case "empty":
                    bw.write((q.isEmpty() ? "1" : "0") + "\n");
                    break;

                case "front":
                    if (q.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(q.peek() + "\n");
                    }
                    break;

                case "back":
                    if (q.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(last + "\n");
                    }
                    break;
            }
        }
        bw.flush();
    }
}
