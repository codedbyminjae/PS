import java.io.*;

public class Num2566 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int[][] arr = new int[9][9];

        for (int i = 0; i < 9; i++) {
            String[] row = br.readLine().split(" ");
            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(row[j]);
            }
        }

        int max= 0;
        int row= 0;
        int col = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        bw.write(max+"\n");
        bw.write((row + 1) + " " + (col + 1) + "\n");
        bw.flush();

    }
}
