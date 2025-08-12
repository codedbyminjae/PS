import java.io.*;
import java.util.*;

public class Num1764 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        String[] first = br.readLine().split(" ");
        int N =  Integer.parseInt(first[0]);
        int M =  Integer.parseInt(first[1]);

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0 ; i< N; i++) {
            String name = br.readLine();
            map.put(name, 1);
        }

        for (int i = 0 ; i< M; i++) {
            String name = br.readLine();
            if (map.containsKey(name)) {
                map.put(name, map.get(name) + 1);
            }
        }

        List<String> result = new ArrayList<>();

        for (String name : map.keySet()) {
            if (map.get(name) >= 2) {
                result.add(name);
            }
        }
        Collections.sort(result);

        bw.write(result.size() + "\n");
        for (String name : result) {
            bw.write(name+"\n");
        }
        bw.flush();
    }
}
