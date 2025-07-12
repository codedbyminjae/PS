import java.io.*;

public class Num10809 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String S = br.readLine();

        int nums[] = new int[26];

        for (int i = 0; i < 26; i++) {
            nums[i] = -1;
        }

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            int index = ch - 'a';
            if (nums[index] == -1) {
                nums[index] = i;
            }
        }
        for (int i = 0; i < 26; i++) {
            bw.write(nums[i] + " ");
        }
        bw.flush();
    }
}