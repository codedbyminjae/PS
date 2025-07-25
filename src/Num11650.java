import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Num11650 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {

        int N = Integer.parseInt(br.readLine());

        List<Member> num = new ArrayList<Member>();

        for (int i = 0; i < N; i++) {
            String[] numbers =  br.readLine().split(" ");
            int a = Integer.parseInt(numbers[0]);
            int b = Integer.parseInt(numbers[1]);

            num.add(new Member(a, b));
        }

        Collections.sort(num, new Comparator<Member>() {
            @Override
            public int compare(Member o1, Member o2) {
                if (o1.x != o2.x) {
                    return o1.x - o2.x;
                } else {
                    return o1.y - o2.y;
                }
            }
        });

        for (int i = 0; i < N; i++) {
            bw.write(num.get(i).x + " " + num.get(i).y + "\n");
        }
        bw.flush();

    }

    public static class Member {
        int x;
        int y;
        public Member(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
