import java.io.*;

public class Num10250 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            String[] s = br.readLine().split(" ");
            int H = Integer.parseInt(s[0]);
            int W = Integer.parseInt(s[1]);
            int N = Integer.parseInt(s[2]);
            // 층 수, 각 층의 방 수, 손님 번호
            int floor = (N - 1) % H + 1;
            int room = (N - 1) / H + 1;

            bw.write(floor * 100 + room + "\n");
        }
        bw.flush();

    }
}