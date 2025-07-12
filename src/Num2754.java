import java.io.*;

public class Num2754 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String grade = br.readLine();

        double score = 0;
        if (grade.equals("A+")) {
            score = 4.3;
        } else if (grade.equals("A0")) {
            score = 4.0;
        } else if (grade.equals("A-")) {
            score = 3.7;
        } else if (grade.equals("B+")) {
            score = 3.3;
        } else if (grade.equals("B0")) {
            score = 3.0;
        } else if (grade.equals("B-")) {
            score = 2.7;
        } else if (grade.equals("C+")) {
            score = 2.3;
        } else if (grade.equals("C0")) {
            score = 2.0;
        } else if (grade.equals("C-")) {
            score = 1.7;
        } else if (grade.equals("D+")) {
            score = 1.3;
        } else if (grade.equals("D0")) {
            score = 1.0;
        } else if (grade.equals("D-")) {
            score = 0.7;
        } else if (grade.equals("F")) {
            score = 0.0;
        }
        bw.write(score+"\n");
        bw.flush();
    }
}