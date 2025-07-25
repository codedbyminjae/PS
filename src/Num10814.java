import java.io.*;
import java.util.*;

public class Num10814 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int N =  Integer.parseInt(br.readLine());

        List<Member> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String[] str =  br.readLine().split(" ");
            int age =  Integer.parseInt(str[0]);
            String name = str[1];

            list.add(new Member(age, name));
        }

        Collections.sort(list, new Comparator<Member>() {
            @Override
            public int compare(Member o1, Member o2) {
                return o1.age - o2.age;
            }
        });

        for (int i = 0; i < N; i++) {
            bw.write(list.get(i).age + " " + list.get(i).name + "\n");
        }
        bw.flush();
    }

    public static class Member {
        int age;
        String name;

        public Member(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }
}
