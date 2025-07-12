import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Num1417 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        if (N == 1) {
            System.out.println(0);
            return;
        }
        int ds = Integer.parseInt(br.readLine());

        ArrayList<Integer> vote = new ArrayList<>();

        for (int i = 0; i < N-1; i++) {
            vote.add(Integer.parseInt(br.readLine()));
        }

        int count = 0;

        while (ds <= Collections.max(vote)) {
            int maxVote = 0;
            for (int i = 1; i < N-1; i++) {
                if (vote.get(i) > vote.get(maxVote)) {
                    maxVote = i;
                }
            }

            vote.set(maxVote, vote.get(maxVote) - 1);
            ds += 1;
            count += 1;
        }

        System.out.println(count);
    }
}