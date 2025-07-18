import java.io.*;

public class Num14626 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        String isbn = br.readLine();

        int[] numbers = new int[isbn.length()];
        int index = -1;

        for (int i =0; i< isbn.length();i++){
            char ch = isbn.charAt(i);

            if (ch == 'X') {
                numbers[i] = 10;
            } else if (ch == '*') {
                index = i;
                numbers[i] = 0;
            } else {
                numbers[i] = ch - '0';
            }
        }



        for (int i = 0; i < 10; i++) {
            numbers[index] = i;

            int sum = 0;

            for (int j = 0; j < numbers.length; j++) {
                if (j % 2 == 0) {
                    sum += numbers[j];
                } else {
                    sum += 3 * numbers[j];
                }
            }

            if (sum % 10 == 0) {
                if (i == 10) {
                    bw.write("X" + "\n");
                } else {
                    bw.write(i + "\n");
                }
                break;
            }
        }
        bw.flush();
    }
}
