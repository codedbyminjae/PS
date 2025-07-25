import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Num11866 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String[] numbers =  br.readLine().split(" ");
        int n = Integer.parseInt(numbers[0]);
        int k = Integer.parseInt(numbers[1]);

        List<Integer> list = new ArrayList<Integer>();

        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        List<Integer> answer = new ArrayList<Integer>();
        int index = 0;

        while (!list.isEmpty()) {
            index = (index + k -1) % list.size();
            answer.add(list.remove(index));
        }

        bw.write("<");
        for (int i = 0; i < answer.size(); i++) {
            bw.write(String.valueOf(answer.get(i)));
            if (i != answer.size() - 1) {
                bw.write(", ");
            }
        }
        bw.write(">");
        bw.flush();

    }
}
