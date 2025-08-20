import java.io.*;

public class Num10798 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        char[][] arr = new char[5][15];
        for (int i = 0; i < 5; i++) {
            String rows = br.readLine();
            for (int j = 0; j < rows.length(); j++) {
                arr[i][j] = rows.charAt(j);
            }
        }

        for (int col = 0; col < 15; col++) {
            for (int row = 0; row < 5; row++) {
                if (arr[row][col] != '\0') {
                    bw.write(arr[row][col]);
                }
            }
        }
        bw.flush();
    }
}
