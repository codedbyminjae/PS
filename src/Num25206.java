import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Num25206 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        Map<String, Double> gradeMap = new HashMap<>();
        gradeMap.put("A+", 4.5);
        gradeMap.put("A0", 4.0);
        gradeMap.put("B+", 3.5);
        gradeMap.put("B0", 3.0);
        gradeMap.put("C+", 2.5);
        gradeMap.put("C0", 2.0);
        gradeMap.put("D+", 1.5);
        gradeMap.put("D0", 1.0);
        gradeMap.put("F", 0.0);

        double totalScore = 0.0;
        double totalCredit = 0.0;

        for (int i = 0; i < 20; i++) {
            String[] school =  br.readLine().split(" ");
            double credit = Double.parseDouble(school[1]);
            String grade = school[2];

            if (grade.equals("P")) {
                continue;
            }

            totalScore = totalScore + (credit * gradeMap.get(grade));
            totalCredit = totalCredit + credit;
        }

        double result = totalScore / totalCredit;
        bw.write(String.format("%.6f\n", result));
        bw.flush();
    }
}
