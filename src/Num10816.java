import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Num10816 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());

        Map<Integer, Integer> map = new HashMap<>();

        String[] numbers1 = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            int num =  Integer.parseInt(numbers1[i]);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int M =  Integer.parseInt(br.readLine());
        String[] numbers2 = br.readLine().split(" ");
        for (int i = 0; i < M; i++) {
            int key = Integer.parseInt(numbers2[i]);
            bw.write(map.getOrDefault(key, 0) + " ");
        }
        bw.flush();
    }
}
