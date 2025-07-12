import java.io.*;

public class Num2920 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        String[] music = br.readLine().split(" ");

        int[] nums = new int[8];

        for (int i = 0; i < 8; i++) {
            nums[i] = Integer.parseInt(music[i]);
        }

        int account = 0;
        int decount = 0;

        for (int i = 0; i < 7; i++) {
            if (nums[i] < nums[i + 1]) {
                account++;
            }
            else if (nums[i] > nums[i + 1]) {
                decount++;
            }
        }
        if (account == 7)
            bw.write("ascending" + "\n");
        else if (decount == 7)
            bw.write("descending" + "\n");
        else
            bw.write("mixed");

        bw.flush();
        bw.close();
    }
}