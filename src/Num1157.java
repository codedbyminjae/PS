import java.io.*;
import java.util.HashMap;
import java.util.*;

public class Num1157 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String str =  br.readLine().toUpperCase();

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int max = Collections.max(map.values());
        char result = '?';

        List<Character> list = new ArrayList<>(map.keySet());
        for (int i =0; i < list.size(); i++) {
            char key = list.get(i);
            if (map.get(key) == max) {
                if (result == '?') {
                    result = key;
                } else {
                    result = '?';
                    break;
                }
            }
        }
        bw.write(result + "\n");
        bw.flush();
    }
}
