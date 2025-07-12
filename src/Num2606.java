import java.io.*;
import java.util.ArrayDeque;

public class Num2606 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int virus;
    public static void main(String[] args) throws IOException {

        int C = Integer.parseInt(br.readLine());
        int V = Integer.parseInt(br.readLine());

        int[][] m = new int[C+1][C+1];
        boolean[] visited = new boolean[C+1];

        for (int i = 0; i < V; i++) {
            String[] num =  br.readLine().split(" ");
            int a = Integer.parseInt(num[0]);
            int b = Integer.parseInt(num[1]);

            m[a][b] = 1;
            m[b][a] = 1;
        }

        ArrayDeque<Integer> d = new ArrayDeque<>();
        d.add(1);
        visited[1] = true;

        // 저번 시간에 했던 덱 사용
        while (!d.isEmpty()) {
            int now = d.poll();
            for (int i = 0; i <= C; i++) {
                if(!visited[i] && m[now][i] == 1) {
                    d.add(i);
                    visited[i] = true;
                    virus++;
                }
            }
        }
        bw.write(virus + "\n");
        bw.flush();

    }
}