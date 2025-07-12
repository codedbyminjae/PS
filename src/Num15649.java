import java.util.Scanner;

public class Num15649 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int N = a.nextInt();
        int M = a.nextInt();

        boolean[] num = new boolean[N + 1];
        int[] res = new int[M];

        letsgo(N, M, res, num, 0);
    }

    public static void letsgo(int N, int M, int[] res, boolean[] num, int depth) {
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                System.out.print(res[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (!num[i]) {
                num[i] = true;
                res[depth] = i;
                letsgo(N, M, res, num, depth + 1);
                num[i] = false; // 백트래킹
            }
        }
    }
}