import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Num1620 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        String[] first = br.readLine().split(" ");
        int N = Integer.parseInt(first[0]);
        int M = Integer.parseInt(first[1]);

        // 숫자는 이름으로, 이름은 숫자로
        String[] numToName = new String[N + 1];
        Map<String, Integer> nameToNum = new HashMap<String, Integer>();

        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            numToName[i] = name;
            nameToNum.put(name, nameToNum.getOrDefault(name, 0) + i);
        }

        for (int j = 0; j < M; j++) {
            String solution = br.readLine();
            if (Character.isDigit(solution.charAt(0))) {

                int num = Integer.parseInt(solution);
                bw.write(numToName[num] + "\n");
            } else {
                bw.write(nameToNum.get(solution) + "\n");
            }
        }

        bw.flush();
    }
}
