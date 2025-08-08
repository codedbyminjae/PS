import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Num11723 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int M = Integer.parseInt(br.readLine());

        int S = 0; // 집합
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < M; i++) {
            String[] command = br.readLine().split(" ");
            String op = command[0];

            int x= 0;
            if (command.length == 2) {
                x = Integer.parseInt(command[1]);
            }

            switch (op) {
                case "add":
                    set.add(x);
                    break;
                case "remove":
                    set.remove(x);
                    break;
                case "check":
                    bw.write((set.contains(x) ? 1 : 0) + "\n");
                    break;
                case "toggle":
                    if (set.contains(x)) {
                        set.remove(x);
                    } else {
                        set.add(x);
                    }
                    break;
                case "all":
                    for (int j = 1; j <= 20; j++) {
                        set.add(j);
                    }
                    break;
                case "empty":
                    set.clear();
                    break;
            }
        }
        bw.flush();
    }
}
